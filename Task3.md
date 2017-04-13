# Task 3
Quick explanation to the framework: 
Framework was tested against 3 browsers IE11, Chrome 52 and Firefox 57. It uses selenium 3.3.0. I commit also drivers so you don't have to find it for yourself. Normally I do not commit drivers to Repository. Let me apologize for that.
The only thing you might need to change are binaries file paths in .properties file. Probably you have the same file paths.

##### 1. tests-suite.xml
Stores test names to be executed. I usually create several files with different tests to be executed e.g. smoke-tests.xml, full-suite.xml and change only pom.xml. You can obviously execute test cases using testng.
##### 2. functional-automated-test.properties
Stores credentials, origin-address, also path to binaries for 3 browsers.
You can also set some flags so you decide what browsers you want to execute tests against. When all selected false Firefox will start. If you ask me how to run tests against all browsers than I would answer that in case of CI I would separate .properties files for each browser and modify MainTest.class a bit.
##### 3. Tests.class 
I like to write tests to be easy to understand for developers, testers, new joiners and even client ut not using BDD layer. Tests look like manual tests from Task 1.
##### 4. Pages classes 
I like to keep locators in methods. But I also see advantages of PageFactory and keep locators in one place. I also like to use explicit waits in methods.
##### 5. Logger 
Truly I never used logger. It was my first and I don't know good practices. I would like to learn how to use them properly.