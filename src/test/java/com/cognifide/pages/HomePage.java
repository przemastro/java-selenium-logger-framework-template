package com.cognifide.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Przemek on 10.04.2017.
 */
public class HomePage extends MainPage{

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(event_driver, this);
    }

    public HomePage navigateToForkedRepositoryPage(String url) {
        logger.info("navigateToForkedRepositoryPage from HomePage");
        event_driver.get(url);
        return this;
    }

    public HomePage verifyTitle(String title) {
        logger.info("verifyTitle in HomePage");
        assertThat(event_driver.getTitle(), is(title));
        return this;
    }
}
