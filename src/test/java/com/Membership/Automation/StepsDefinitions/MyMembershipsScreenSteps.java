package com.Membership.Automation.StepsDefinitions;

import com.Membership.Automation.Screens.MyMembershipsScreen;
import com.Membership.Automation.Utility.TestBase;
import io.cucumber.java.en.Then;

public class MyMembershipsScreenSteps extends TestBase {

    MyMembershipsScreen MyMemberships;
    public MyMembershipsScreenSteps() {

        MyMemberships = new MyMembershipsScreen(driver);
    }

    @Then("I select My Memberships")
    public void i_select_my_memberships() {
        // Write code here that turns the phrase above into concrete actions
        MyMemberships.ISelectMyMemberships();
    }
    @Then("My Memberships Screen is displayed")
    public void my_memberships_screen_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        MyMemberships.MyMembershipsScreenIsDisplayed();
    }
    @Then("by default My Memberships Tab Screen is displayed")
    public void by_default_my_memberships_tab_screen_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        MyMemberships.MyMembershipsTabScreen();
    }
    @Then("verify the My Memberships list")
    public void verify_the_my_memberships_list() {
        // Write code here that turns the phrase above into concrete actions
        MyMemberships.MyMembershipsTitleScreen();
    }

    @Then("I Click On Receipts Tab Screen is displayed")
    public void i_click_on_receipts_tab_screen_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        MyMemberships.ClickOnReceiptsTabScreenIsDisplayed();
    }
    @Then("verify the Receipts of My Memberships list")
    public void verify_the_receipts_of_my_memberships_list() {
        // Write code here that turns the phrase above into concrete actions
        MyMemberships.ReceiptsInvoiceListScreen();
    }

    @Then("I Click on anyone of Completed Memberships")
    public void i_click_on_anyone_of_completed_memberships() {
        // Write code here that turns the phrase above into concrete actions
        MyMemberships.SelectTheMemberships();
    }
    @Then("Navigate Memberships Details Screen is displayed")
    public void navigate_memberships_details_screen_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        MyMemberships.MembershipsDetailsScreen();
    }

    @Then("I Click on Visit our terms and conditions")
    public void i_click_on_visit_our_terms_and_conditions() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        MyMemberships.IClickToTermsAndConditions();
    }

    @Then("Navigate to Terms and Conditions Screen is displayed")
    public void navigate_to_terms_and_conditions_screen_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        MyMemberships.NavigateToTermsAndConditionsScreenIsDisplayed();
    }

    @Then("I click Back to My Memberships button")
    public void i_click_back_to_my_memberships_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        MyMemberships.IClickBackToMyMembershipsButton();
    }


}
