package com.cognifide.tests;

import com.cognifide.WebEventListener;
import com.cognifide.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Przemek on 10.04.2017.
 */
public class MainTest {


    protected WebDriver driver;
    protected EventFiringWebDriver event_driver;
    private WebEventListener eventListener;
    private static String url;
    private String chromeDriver;
    private String chromeBinary;
    private Boolean chromeFlag;
    private String ieDriver;
    private String ieBinary;
    private Boolean ieFlag;
    private String firefoxDriver;
    private String firefoxBinary;
    private Boolean firefoxFlag;

    protected String login;
    protected String password;
    protected String pathResources;

    public MainTest() {
        initializeProperties();
    }

    private void initializeProperties() {
        Properties prop = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("functional-automated-tests.properties");
        try {
            prop.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        url = prop.getProperty("functional-automated-tests.url");

        chromeFlag = Boolean.parseBoolean(prop.getProperty("functional-automated-tests.ChromeFlag"));
        ieFlag = Boolean.parseBoolean(prop.getProperty("functional-automated-tests.IEFlag"));
        firefoxFlag = Boolean.parseBoolean(prop.getProperty("functional-automated-tests.FirefoxFlag"));
        if(chromeFlag) {
            chromeDriver = prop.getProperty("functional-automated-tests.ChromeDriverPath");
            chromeBinary = prop.getProperty("functional-automated-tests.ChromeBinaryPath");
        }
        else if(ieFlag) {
            ieDriver = prop.getProperty("functional-automated-tests.IEDriverPath");
            ieBinary = prop.getProperty("functional-automated-tests.IEBinaryPath");
        }
        else {
            firefoxDriver = prop.getProperty("functional-automated-tests.FirefoxDriverPath");
            firefoxBinary = prop.getProperty("functional-automated-tests.FirefoxBinaryPath");
        }
        pathResources = prop.getProperty("mainTest.pathResources");
        login = prop.getProperty("mainTest.login");
        password = prop.getProperty("mainTest.password");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeClass(Method method) {
        if(chromeFlag) {
            beforeChrome();
        }
        else if(ieFlag) {
            beforeIE();
        }
        else {
            beforeFirefox();
        }
        event_driver = new EventFiringWebDriver(driver);
        eventListener = new WebEventListener();
        event_driver.register(eventListener);
        event_driver.manage().window().maximize();
        event_driver.manage().timeouts().implicitlyWait(MainPage.DEFAULT_WAIT_FOR_PAGE_LOAD, TimeUnit.SECONDS);
        event_driver.manage().timeouts().pageLoadTimeout(MainPage.DEFAULT_WAIT_FOR_PAGE_LOAD, TimeUnit.SECONDS);
        event_driver.manage().timeouts().setScriptTimeout(MainPage.DEFAULT_WAIT_FOR_PAGE_LOAD, TimeUnit.SECONDS);
        event_driver.manage().deleteAllCookies();

        System.out.println("Test method being run: " + method.getName());
        event_driver.get(url);
    }

    @AfterMethod(alwaysRun = true)
    public void afterClass() {
        event_driver.close();
        event_driver.quit();
    }

    private void beforeChrome() {
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        ChromeOptions options = new ChromeOptions();
        options.setBinary(chromeBinary);
        options.addArguments("--disable-extensions");
        driver = new ChromeDriver(options);
    }

    private void beforeIE() {
        System.setProperty("webdriver.ie.driver", ieDriver);
        DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        driver = new InternetExplorerDriver(ieCapabilities);
    }

    private void beforeFirefox() {
        System.setProperty("webdriver.gecko.driver", firefoxDriver);
        driver = new FirefoxDriver();
    }

}
