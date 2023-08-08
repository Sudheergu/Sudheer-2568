package com.Membership.Automation.StepsDefinitions;


import com.Membership.Automation.Screens.SignInScreen;
import com.Membership.Automation.Screens.TeeTimeListingScreen;
import com.Membership.Automation.Utility.PropertyLoader;
import com.Membership.Automation.Utility.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.Properties;

public class TeeTimeListingScreenSteps extends TestBase {

    TeeTimeListingScreen TeeTimeScreen;
    SignInScreen LogIn;
    Properties prop;

    public TeeTimeListingScreenSteps() throws IOException {
        driver = TestBase.getDriver();
        prop = PropertyLoader.loadData();
        TeeTimeScreen=new TeeTimeListingScreen(driver);
        LogIn=new SignInScreen(driver);
    }

    @Given("User is on Membership tee time landing page")
    public void user_is_on_membership_tee_time_landing_page()throws IOException{
        driver.get(prop.getProperty("Url"));
    }

    @Then("User Select Course")
    public void user_select_course() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TeeTimeScreen.SelectCourses();
    }
    @When("User Select Date")
    public void user_select_date() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TeeTimeScreen.SelectDateonRightArrow();
    }

    @When("User Select Players")
    public void user_select_players() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TeeTimeScreen.SelectPlayers();
    }

    @When("User Select Holes")
    public void user_select_holes() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TeeTimeScreen.SelectHoles();
    }

    @When("clicks on Search button icon")
    public void clicks_on_search_button_icon() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TeeTimeScreen.ClickonSearchbutton();
    }
    @When("user scrolls down to desired tee time")
    public void user_scrolls_down_to_desired_tee_time() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TeeTimeScreen.scrollDownatTeeTimeScreen();
    }
    @When("Select anyone of the Tee time tile")
    public void select_anyone_of_the_tee_time_tile() {
        // Write code here that turns the phrase above into concrete actions
        TeeTimeScreen.SelectTeeTimeTile();
    }
    @Then("Navigate to Rate type Screen is displayed")
    public void navigate_to_rate_type_screen_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TeeTimeScreen.RatetypeScreen();
    }


}
