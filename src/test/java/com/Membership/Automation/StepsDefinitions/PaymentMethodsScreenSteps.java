package com.Membership.Automation.StepsDefinitions;


import com.Membership.Automation.Screens.PaymentMethodsScreen;
import com.Membership.Automation.Utility.TestBase;
import io.cucumber.java.en.Then;

public class PaymentMethodsScreenSteps extends TestBase {


    PaymentMethodsScreen Payment;
    public PaymentMethodsScreenSteps() {
        Payment =new PaymentMethodsScreen(driver);
    }

    @Then("I Select Payment Methods")
    public void i_select_payment_methods() {
        // Write code here that turns the phrase above into concrete actions
        Payment.ISelectPaymentMethods();
    }
    @Then("Navigate to Payment Methods Screen is displayed")
    public void navigate_to_payment_methods_screen_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Payment.NavigateToPaymentMethodsScreen();
    }

    @Then("click to Remove button\\(Blue color)")
    public void click_to_remove_button_blue_color() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Payment.clickOnRemoveButtonOfCard();
    }
    @Then("the again the Payment methods Screen is displayed")
    public void the_again_the_payment_methods_screen_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        Payment.ThenAgainBackToPaymentMethodsScreen();
    }

    @Then("the Validation error Message should appear\\(captured)")
    public void the_validation_error_message_should_appear_captured() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
