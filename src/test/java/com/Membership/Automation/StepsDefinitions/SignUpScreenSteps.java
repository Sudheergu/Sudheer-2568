package com.Membership.Automation.StepsDefinitions;

import com.Membership.Automation.Screens.SignUpScreen;
import com.Membership.Automation.Utility.PropertyLoader;
import com.Membership.Automation.Utility.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.sourceforge.tess4j.TesseractException;

import java.io.IOException;
import java.util.Properties;

public class SignUpScreenSteps extends TestBase {

    SignUpScreen SignUp;
    Properties prop;
    public SignUpScreenSteps() throws IOException {
        prop = PropertyLoader.loadData();
        SignUp= new SignUpScreen(driver);

    }

    @Then("I Click on Profile of SignUp button")
    public void i_click_on_profile_of_sign_up_button() {
      // Write code here that turns the phrase above into concrete actions
        SignUp.ClickToSignUpButton();
    }
    @Then("Navigate to SignUp Screen is displayed")
    public void navigate_to_sign_up_screen_is_displayed() throws InterruptedException {
          // Write code here that turns the phrase above into concrete actions
        SignUp.NavigateToSignUpScreen();
    }
    @When("^I Enter details of fields like (.+),(.+),(.+),(.+),(.+) and (.+)")
    public void i_enter_details_of_fields_like(String Email,String FirstName,String LastName, String Password, String ConfirmPassword, String ZipCode) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        SignUp.SignUpDetails(prop.getProperty(Email),prop.getProperty(FirstName),prop.getProperty(LastName),prop.getProperty(Password),prop.getProperty(ConfirmPassword),prop.getProperty(ZipCode));
    }

    @Then("Captured the Captcha then Enter the Captcha in the field")
    public void captured_the_captcha_then_enter_the_captcha_in_the_field() throws IOException, InterruptedException, TesseractException {
        // Write code here that turns the phrase above into concrete actions
        SignUp.CapturedTheCaptcha();
    }

    @Then("I Click on Sign Up button\\(Blue color)")
    public void i_click_on_sign_up_button_blue_color() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        SignUp.IClickOnSignUpButton();
    }








}
