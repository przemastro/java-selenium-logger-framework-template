package com.cognifide.pages;

import com.cognifide.WebEventListener;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Przemek on 10.04.2017.
 */
public class MainPage {

    public static final int DEFAULT_WAIT_FOR_PAGE_LOAD = 10;
    final static Logger logger = Logger.getLogger(MainPage.class);
    protected final WebDriver driver;
    protected EventFiringWebDriver event_driver;
    protected WebEventListener eventListener;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        event_driver = new EventFiringWebDriver(driver);
        eventListener = new WebEventListener();
        event_driver.register(eventListener);
        event_driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT_FOR_PAGE_LOAD, TimeUnit.SECONDS);
        event_driver.manage().timeouts().pageLoadTimeout(DEFAULT_WAIT_FOR_PAGE_LOAD, TimeUnit.SECONDS);
        event_driver.manage().timeouts().setScriptTimeout(DEFAULT_WAIT_FOR_PAGE_LOAD, TimeUnit.SECONDS);
    }

    // Username input field
    @FindBy(id="j_username")
    WebElement usernameField;

    // Password input field
    @FindBy(id="j_password")
    WebElement passwordField;

    // Submit input field
    @FindBy(id="submit")
    WebElement submitField;

    // Branches button
    @FindBy(xpath="//a[@id='repository-nav-branches']/span[2]")
    WebElement branchesButton;

    // Branch name field
    @FindBy(id="paged-table-input-for-branch-list")
    WebElement branchField;

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

}
