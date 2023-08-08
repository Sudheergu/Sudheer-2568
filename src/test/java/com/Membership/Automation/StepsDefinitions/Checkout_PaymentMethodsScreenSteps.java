package com.Membership.Automation.StepsDefinitions;

import com.Membership.Automation.Screens.Checkout_PaymentMethodsScreen;
import com.Membership.Automation.Screens.TeeTimeListingScreen;
import com.Membership.Automation.Utility.PropertyLoader;
import com.Membership.Automation.Utility.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.Properties;

public class Checkout_PaymentMethodsScreenSteps extends TestBase {

    //TeeTimeListingScreen TeeTimeListing;
    Checkout_PaymentMethodsScreen Checkout;
    Properties prop;
    public Checkout_PaymentMethodsScreenSteps() throws IOException {
        prop = PropertyLoader.loadData();
        //LogIn= new SignInScreen(driver);
        //TeeTimeListing = new TeeTimeListingScreen(driver);
        Checkout = new Checkout_PaymentMethodsScreen(driver);

    }

    @When("^User enters (.+), (.+), (.+), (.+), (.+) and (.+)")
    public void user_enters_and(String FirstName,String LastName,String CardNumber,String ExpirationDate,String CVV,String ZipCode) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(Checkout.EnterFirstName.getText());
        Checkout.EnterNewCardDetails(prop.getProperty(FirstName),prop.getProperty(LastName),prop.getProperty(CardNumber),prop.getProperty(ExpirationDate),prop.getProperty(CVV),prop.getProperty(ZipCode));
    }

    @Then("Click on Save Cards Button")
    public void click_on_save_cards_button() throws InterruptedException {
        Checkout.ClickOnSaveCardButtonToSubmit();
    }
    @When("User click on CheckBox of Save cards")
    public void user_click_on_checkbox_of_save_cards() {
        // Write code here that turns the phrase above into concrete actions
        Checkout.ClickOnCheckBoxOfSaveCards();
    }

    @When("Clicks on CheckBox of I acknowledge that I have read & agree to the Terms and Conditions.")
    public void clicks_on_checkbox_of_i_acknowledge_that_i_have_read_agree_to_the_terms_and_conditions() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Checkout.ClickOnCheckBoxTermsAndConditions();
    }
    @When("Clicks on Book Now button")
    public void clicks_on_book_now_button() {
        // Write code here that turns the phrase above into concrete actions
        Checkout.ClickOnBookNowButton();
    }
    @Then("Navigate To Confirmation Screen is displayed")
    public void navigate_to_confirmation_screen_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Checkout.ConfirmationScreen();
    }



}
