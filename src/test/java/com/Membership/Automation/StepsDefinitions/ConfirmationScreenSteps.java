package com.Membership.Automation.StepsDefinitions;

import com.Membership.Automation.Screens.Checkout_PaymentMethodsScreen;
import com.Membership.Automation.Screens.ConfirmationScreen;
import com.Membership.Automation.Utility.PropertyLoader;
import com.Membership.Automation.Utility.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.Properties;

public class ConfirmationScreenSteps extends TestBase {

    Checkout_PaymentMethodsScreen Payment;
    ConfirmationScreen Confirmation;
    Properties prop;
    public ConfirmationScreenSteps() throws IOException {
        prop = PropertyLoader.loadData();
        Confirmation = new ConfirmationScreen(driver);

        Payment = new Checkout_PaymentMethodsScreen(driver);

    }

    @Then("Check the Tee time Confirmation Number")
    public void check_the_tee_confirmation_number(){
        //
        Confirmation.TeeTimeConfirmationNumber();
    }

    @Then("Click on Home Back Button")
    //
    public void click_on_home_back_button() throws InterruptedException {
        Confirmation.ClickOnBackTOHomeButton();
    }






}
