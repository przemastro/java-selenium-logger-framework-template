package com.cognifide.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Przemek on 10.04.2017.
 */
public class LoggedInUserPage extends MainPage{


    private WebDriverWait wait;

    public LoggedInUserPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(event_driver, this);
    }

    public LoggedInUserPage verifyTitle(String title) {
        logger.info("verifyTitle in LoggedInUserPage");
        wait = new WebDriverWait(event_driver, 5);
        wait.until(ExpectedConditions.titleIs(title));
        assertThat(event_driver.getTitle(), is(title));
        return this;
    }

    public LoggedInUserPage clickBranchesButton() {
        logger.info("clickBranchesButton in LoggedInUserPage");
        branchesButton.click();
        return this;
    }

    public LoggedInUserPage typeInvalidBranchName(String name) {
        logger.info("typeInvalidBranchName in LoggedInUserPage");
        branchField.sendKeys(name);
        return this;
    }

    public LoggedInUserPage verifyBranchIsNotPresent(String message) {
        logger.info("verifyBranchIsNotPresent in LoggedInUserPage");
        wait = new WebDriverWait(event_driver, 5);
        Assert.assertEquals(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='paged-table-message']"))).getText(),message);
        return this;
    }
}
