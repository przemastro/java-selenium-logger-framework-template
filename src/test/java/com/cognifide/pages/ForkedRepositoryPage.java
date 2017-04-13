package com.cognifide.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Przemek on 10.04.2017.
 */
public class ForkedRepositoryPage extends MainPage {


    private WebDriverWait wait;

    public ForkedRepositoryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(event_driver, this);
    }

    public ForkedRepositoryPage verifyTitle(String title) {
        logger.info("verifyTitle in ForkedRepositoryPage");
        assertThat(event_driver.getTitle(), is(title));
        return this;
    }

    public ForkedRepositoryPage login(String name, String pass) {
        logger.info("login to LoggedInUserPage");
        usernameField.sendKeys(name);
        passwordField.sendKeys(pass);
        submitField.click();
        return this;
    }
}
