package com.Membership.Automation.StepsDefinitions;

import com.Membership.Automation.Screens.SignInScreen;
import com.Membership.Automation.Utility.PropertyLoader;
import com.Membership.Automation.Utility.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import java.util.Properties;

public class SignInScreenSteps extends TestBase {

    SignInScreen LogIn;
    Properties prop;

    public SignInScreenSteps() throws IOException {
        prop = PropertyLoader.loadData();
        LogIn=new SignInScreen(driver);
    }

    @Then("User click on Course Policies Done button")
    public void user_click_on_course_policies_done_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        LogIn.ClickonCoursePoliciesDoneButton();
    }
    @Given("^I Click on Profile of Login button")
    public void i_click_on_profile_of_login_button() throws InterruptedException {
        LogIn.IClickonProfileofLoginbutton();
    }
    @When("^I enter the (.+) and (.+)")
    public void i_enter_the_and(String Email, String Password) throws InterruptedException{
        System.out.println(LogIn.emailField.getText());
        LogIn.signInDetails(prop.getProperty(Email),prop.getProperty(Password));
    }

    @When("I Click on Login button")
    public void i_click_on_login_button() throws InterruptedException {
        LogIn.IClickOnLogin();
    }

    @Then("Navigate to Tee Time Screen is displayed")
    public void navigate_to_tee_time_screen_is_displayed() {
    }

    @Then("Verify the EmailInvalid validation message is displayed")
    public void verify_the_email_invalid_validation_message_is_displayed() {
        LogIn.emailInvalidValidationMessage();
        //  signin.emailValidationMessage();
    }
    @Then("^Verify the EmailOrPasswordInvalid Validation message is displayed$")
    public void Verify_the_emailOrPasswordInvalid_Validation_message_is_displayed() throws Throwable {
        // signin.emialOrPasswordInvalidMessage();
        LogIn.emialandPasswordInvalidMessage();
    }

    @When("I Click on label of Password Field")
    public void i_click_on_label_of_password_field() {
        // Write code here that turns the phrase above into concrete actions
        LogIn.IClickonlabelofPasswordField();
    }

    @Then("Verify the Emailempty and Passwordempty validation message is displayed")
    public void verify_the_emailempty_and_passwordempty_validation_message_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        LogIn.EmailAndPasswordEmptyemailValidationMessage();
    }
    @Then("I Verify the login button is disable")
    public void i_verify_the_login_button_is_disable() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        LogIn.EmailAndPasswordEmptyemailValidationMessage();
    }

    @Given("I click Forgot your Password Link?")
    public void i_click_forgot_your_password_link() {
        // Write code here that turns the phrase above into concrete actions
        LogIn.clickOnForGotyourPassword();
    }
    @Then("Navigate to Forgot your password screen is displayed")
    public void navigate_to_forgot_your_password_screen_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        LogIn.forgotyourPasswordScreen();
    }
    @When("^I enter on email Field (.+)$")
    public void i_enter_on_email_field_emailincorrect(String existingEmail) {
        // Write code here that turns the phrase above into concrete actions
        LogIn.forGotyourPasswordAndResendUnlockInstructionsEmailField(prop.getProperty(existingEmail));
    }
    @Then("click on label of Email Field")
    public void click_on_label_of_email_field() {
        // Write code here that turns the phrase above into concrete actions
        LogIn.ClickonLabelofEmailfield();
    }
    @Then("Verify the InvalidEmail Validation message is displayed")
    public void verify_the_invalid_email_validation_message_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        LogIn.ForgotyourPasswordandResendunlockinstructionsScreenEmailInvalidValidationMessage();
    }
    @Given("I Click Didnot receive unlock instructions?")
    public void i_click_didnot_receive_unlock_instructions() {
        // Write code here that turns the phrase above into concrete actions
        LogIn.ClickDidnotrecieveunlockinstructions();
    }
    @Then("Navigate to Resend Unlock Instructions screen is displayed")
    public void navigate_to_resend_unlock_instructions_screen_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        LogIn.ResendUnlockInstructionsScreen();
    }

    @When("I click on Send link button")
    public void i_click_on_send_link_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        LogIn.forGotyourPasswordAndResendUnlockInstructionsEmailFieldSendLinkButton();
    }

    //@Then("Verified forgot password email message is dispalyed")
    //public void verified_forgot_password_email_message_is_dispalyed() {
    // Write code here that turns the phrase above into concrete actions
    /// throw new io.cucumber.java.PendingException();
    //}

    @And("I click on Back to SignInLink button")
    public void i_click_on_back_to_sign_in_link_button() {
        // Write code here that turns the phrase above into concrete actions
        LogIn.ClickonBacktoSignlinkbutton();
    }

    @Given("I click on Donot have an account? Sign Up link button")
    public void i_click_on_donot_have_an_account_sign_up_link_button() {
        // Write code here that turns the phrase above into concrete actions
        LogIn.SignUpLinkButtonintheloginScreen();
    }

    @Then("Navigate to Sign Up Screen is displayed")
    public void navigate_to_sing_up_screen_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        LogIn.SignUpScreen();
    }

    @Then("I click on Already have an account? Log in link button")
    public void i_click_on_already_have_an_account_log_in_link_button() {
        // Write code here that turns the phrase above into concrete actions
        LogIn.ClickonBacktoLoginLinkButton();
    }

    @Then("Navigate to Login to your Account screen is displayed")
    public void navigate_to_login_to_your_account_screen_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        LogIn.BacktoLogintoyourAccountScreen();
    }

}
