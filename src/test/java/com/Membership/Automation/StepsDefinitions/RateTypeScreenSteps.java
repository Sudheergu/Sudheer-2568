package com.Membership.Automation.StepsDefinitions;

import com.Membership.Automation.Screens.RateTypeScreen;
import com.Membership.Automation.Utility.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RateTypeScreenSteps extends TestBase {

    //SignInScreen LogIn;
    //TeeTimeListingScreen TeeTimeListing;
    RateTypeScreen RateType;

   public RateTypeScreenSteps(){
       //LogIn= new SignInScreen(driver);
       //TeeTimeListing= new TeeTimeListingScreen(driver);
       RateType=new RateTypeScreen(driver);

   }


    @When("user scrolls down to desired rate type")
    public void user_scrolls_down_to_desired_rate_type() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        RateType.scrollDownatRateType();
    }
    @When("Select anyone of the Rate Type tile")
    public void select_anyone_of_the_rate_type_tile() {
        // Write code here that turns the phrase above into concrete actions
        RateType.SelectRateTypeTile();
    }
    @Then("Navigate to checkout-Payment Methods Screen is displayed")
    public void navigate_to_checkout_payment_methods_screen_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        RateType.Checkout_PaymentMethodsScreen();
    }
}
