package com.Membership.Automation.StepsDefinitions;

import com.Membership.Automation.Screens.TeeTimeBookingFlowScreen;
import com.Membership.Automation.Utility.PropertyLoader;
import com.Membership.Automation.Utility.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.Properties;

public class TeeTimeBookingFlowSteps extends TestBase {

    TeeTimeBookingFlowScreen TeeTimeBookingFlow;
    Properties prop;
    public TeeTimeBookingFlowSteps() throws IOException {
        prop = PropertyLoader.loadData();
        driver= TestBase.getDriver();
        TeeTimeBookingFlow = new TeeTimeBookingFlowScreen(driver);

    }

    ///Checking Same user Received Email or not ?
    @Given("User is on Gmail Sign in Screen")
    public void user_is_on_email_sign_in_screen() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.get(prop.getProperty("GmailUrl"));
        TeeTimeBookingFlow.EmailSignInScreen();

    }
    @When("^I Enter at the Gmail (.+) field$")
    public void i_enter_at_the_gmail_field(String Email) {
        // Write code here that turns the phrase above into concrete actions
        TeeTimeBookingFlow.EnterEmailDetails(prop.getProperty(Email));
    }
    @Then("I Click on Email Next button")
    public void i_click_on_email_next_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TeeTimeBookingFlow.IClickOnEmailNextButton();
    }
    @Then("^I Enter the (.+)$")
    public void i_enter_the(String Password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TeeTimeBookingFlow.EnterPasswordDetails(prop.getProperty(Password));
    }

    @Then("I Click on Password Next button")
    public void i_click_on_password_next_button() {
        // Write code here that turns the phrase above into concrete actions
        TeeTimeBookingFlow.IClickOnPasswordNextButton();
    }

    @Then("User Navigate to Inbox Gmail Screen is displayed")
    public void user_navigate_to_inbox_gmail_screen_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
