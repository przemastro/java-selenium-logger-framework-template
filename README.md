# Test for QA candidates
[![GitHub issues](https://img.shields.io/github/issues/przemastro/java-selenium-logger-framework)](https://github.com/przemastro/java-selenium-logger-framework/issues)
[![GitHub forks](https://img.shields.io/github/forks/przemastro/java-selenium-logger-framework)](https://github.com/przemastro/java-selenium-logger-framework/network)
[![GitHub stars](https://img.shields.io/github/stars/przemastro/java-selenium-logger-framework)](https://github.com/przemastro/java-selenium-logger-framework/stargazers)
[![Java version](https://img.shields.io/badge/Java-1.8-%23b07219)](https://github.com/przemastro/java-selenium-logger-framework)


# Features
I created it when applied for software tester position at Cognified.

1. UI Selenium tests - Using TestNg frameworks
2. Logger - Web Event Listener

# Installation

1. Open repo in your favourite IDE (I use Intellij because of built-in Maven) and set Project SDK to "java version 1.8.0_*"
2. Right click on pom.xml and set MAVEN project, you might need to re-import maven dependencies

# Run

Run maven build

# Usage

Example UI Test method 

        homePage = new HomePage(driver)
				       .verifyTitle("Log in - Cognifide Recruitment Stash");
