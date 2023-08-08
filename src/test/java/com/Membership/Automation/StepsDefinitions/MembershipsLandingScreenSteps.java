package com.Membership.Automation.StepsDefinitions;

import com.Membership.Automation.Screens.MembershipsLandingScreen;
import com.Membership.Automation.Utility.TestBase;
import io.cucumber.java.en.Then;


public class MembershipsLandingScreenSteps extends TestBase {

    MembershipsLandingScreen Memberships;
    public MembershipsLandingScreenSteps() {
        Memberships = new MembershipsLandingScreen(driver);

    }

    @Then("I Click to Memberships button\\(blue color)")
    public void i_click_to_memberships_button_blue_color() {
        // Write code here that turns the phrase above into concrete actions
       Memberships.IClickToMembershipsButton();
    }
    @Then("Navigate to Membership Landing screen")
    public void navigate_to_membership_landing_screen() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Memberships.NavigateToMembershipLandingScreen();
    }

    @Then("Select the Memberships Plan Club")
    public void select_the_memberships_plan_club() {
        // Write code here that turns the phrase above into concrete actions
        Memberships.SelectedTheMembershipsPlanClub();
    }
    @Then("I click on subscribe button\\(blue color)")
    public void i_click_on_subscribe_button_blue_color() {
        // Write code here that turns the phrase above into concrete actions
        Memberships.IClickToSubscribeButton();
    }
    @Then("Clicks on Continue button")
    public void clicks_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        Memberships.IClickToContinueButton();
    }




}
