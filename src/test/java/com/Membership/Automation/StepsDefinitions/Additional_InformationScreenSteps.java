package com.Membership.Automation.StepsDefinitions;

import com.Membership.Automation.Screens.Additional_InformationScreen;
import com.Membership.Automation.Utility.TestBase;
import io.cucumber.java.en.Then;

public class Additional_InformationScreenSteps extends TestBase {

    Additional_InformationScreen Additional;
    public Additional_InformationScreenSteps() {
        Additional = new Additional_InformationScreen(driver);
    }

    @Then("I Select Additional Information")
    public void i_select_additional_information() {
        // Write code here that turns the phrase above into concrete actions
        Additional.ISelectAdditionalInformation();
    }
    @Then("Navigate to Additional Information Screen is displayed")
    public void navigate_to_additional_information_screen_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Additional.NavigateToAdditionalInformationScreen();
    }
    @Then("Select Course to View Additional Information option")
    public void select_course_to_view_additional_information_option() {
        // Write code here that turns the phrase above into concrete actions
        Additional.SelectCourseToViewAdditionalInformation();
    }
    @Then("Click to view button\\(Blue color)")
    public void click_to_view_button_blue_color() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Additional.IClickOnViewButton();
    }
    @Then("Navigate to select course of ForeUpSoftware.com for the user details")
    public void navigate_to_select_course_of_fore_up_software_com_for_the_user_details() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Additional.NavigateToForeUpSoftwareOfUserDetailsScreen();
    }

}
