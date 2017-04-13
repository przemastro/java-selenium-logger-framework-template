package com.cognifide.tests;

import com.cognifide.pages.ForkedRepositoryPage;
import com.cognifide.pages.HomePage;
import com.cognifide.pages.LoggedInUserPage;
import org.testng.annotations.Test;

public class Tests extends MainTest {


	private HomePage homePage;
	private LoggedInUserPage loggedInUserPage;
	private ForkedRepositoryPage forkedRepositoryPage;


	@Test
	public void homePageTest() throws InterruptedException {
		homePage = new HomePage(driver)
				.verifyTitle("Log in - Cognifide Recruitment Stash");
	}

	@Test
	public void secondTest() throws InterruptedException {
		homePage = new HomePage(driver)
				.navigateToForkedRepositoryPage("http://cogjob.cognifide.com/users/przemyslaw.jagodzinski/repos/homework/browse");

		forkedRepositoryPage = new ForkedRepositoryPage(driver)
				.verifyTitle("Log in - Cognifide Recruitment Stash")
				.login(login, password);

        loggedInUserPage = new LoggedInUserPage(driver)
                .verifyTitle("Browse Przemyslaw Jagodzinski / Homework - Cognifide Recruitment Stash")
                .clickBranchesButton()
                .verifyTitle("Branches for Przemyslaw Jagodzinski / Homework - Cognifide Recruitment Stash")
                .typeInvalidBranchName("Dev2")
                .verifyBranchIsNotPresent("No branches match");
	}
}
