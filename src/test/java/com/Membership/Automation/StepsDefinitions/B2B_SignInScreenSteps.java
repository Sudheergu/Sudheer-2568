package com.Membership.Automation.StepsDefinitions;

import com.Membership.Automation.Screens.B2B_SignInScreenScreen;
import com.Membership.Automation.Utility.PropertyLoader;
import com.Membership.Automation.Utility.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;
import java.util.Properties;

public class B2B_SignInScreenSteps extends TestBase{

    B2B_SignInScreenScreen B2B_Login;
    Properties prop;
    public B2B_SignInScreenSteps() throws IOException {
        driver = TestBase.getDriver();
        prop = PropertyLoader.loadData();

        B2B_Login =new B2B_SignInScreenScreen(driver);
    }

    @Given("User is on B2B Sign in Screen")
    public void user_is_on_b2b_sign_in_screen() {
        // Write code here that turns the phrase above into concrete actions
        driver.get(prop.getProperty("B2B-Url"));
    }
    @Then("^I Enter at the B2B (.+) and (.+)")
    public void i_enter_at_the_b2b(String Email, String Password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        B2B_Login.B2B_SignInDetails(prop.getProperty(Email),prop.getProperty(Password));
    }
    @Then("I Click on Login button\\(Orange color)")
    public void i_click_on_login_button_orange_color() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        B2B_Login.ClickToLogInButton();
    }

    @Then("Navigate To Dashboard Screen")
    public void navigate_to_dashboard_screen() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        B2B_Login.NavigateToProgramModule();
    }




}
