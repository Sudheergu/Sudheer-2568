package com.Membership.Automation.StepsDefinitions;

import com.Membership.Automation.Screens.MyProfileScreen;
import com.Membership.Automation.Utility.PropertyLoader;
import com.Membership.Automation.Utility.TestBase;
import io.cucumber.java.en.Then;

import java.io.IOException;
import java.util.Properties;

public class MyProfileScreenSteps extends TestBase {

    MyProfileScreen Profile;
    Properties prop;
    public MyProfileScreenSteps() throws IOException {
        prop = PropertyLoader.loadData();
        Profile = new MyProfileScreen(driver);
    }

    @Then("I select My Profile")
    public void i_select_my_profile() {
        // Write code here that turns the phrase above into concrete actions
        Profile.IClickOnMyProfile();
    }
    @Then("My Profile Screen is displayed")
    public void my_profile_screen_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Profile.MyProfileScreenisdisplayed();
    }

    @Then("I click on Edit button\\(Blue color)")
    public void i_click_on_edit_button_blue_color() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Profile.IClickOnEditButton();
    }
    @Then("Edit My profile Screen is displayed")
    public void edit_my_profile_screen_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Profile.EditMyProfileScreen();
    }

    @Then("^Updating new details for (.+),(.+) and (.+)")
    public void updating_new_details_for(String FirstName,String LastName,String ZipCode) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Profile.EditDetailsOfMyProfile(prop.getProperty(FirstName),prop.getProperty(LastName), prop.getProperty(ZipCode));
    }

    @Then("^User enter (.+),(.+) and (.+)")
    public void user_enter(String CurrentPassword,String NewPassword,String ConfirmationPassword) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Profile.ChangePassword(prop.getProperty(CurrentPassword),prop.getProperty(NewPassword),prop.getProperty(ConfirmationPassword));
    }

    @Then("I click on My Profile Save Changes Button\\(Blue color)")
    public void i_click_on_my_profile_save_changes_button_blue_color() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Profile.MyProfileSaveChangesButton();
    }

    @Then("the Validation error Message should appear\\(captured) at the Passwords Changes Field")
    public void the_validation_error_message_should_appear_captured_at_the_passwords_changes_field() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Profile.EmptyFieldValidationOfPasswordChanges();
    }

    @Then("I click on Password Save Changes button\\(Blue color)")
    public void i_click_on_password_save_changes_button_blue_color() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Profile.PasswordSaveChangesButton();
    }

    @Then("Click to cancel button of Password changes")
    public void click_to_cancel_button_of_password_changes() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Profile.clickOnCancelButton();
    }

}
