package com.Membership.Automation.Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/com/Membership/Automation/Features/SignInScreen.feature",glue = {"com.Membership.Automation.StepsDefinitions","com.Membership.Automation.Utility"},
        plugin = {"html:target/site/cucumber-pretty","json:target/cucumber.json",
                  "junit:target/cucumber-reports/Cucumber.xml",
                  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},monochrome = true,
        tags = "@TC_01-SignIn")

public class TestRunner extends AbstractTestNGCucumberTests {

}



