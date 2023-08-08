package com.Membership.Automation.StepsDefinitions;

import com.Membership.Automation.Screens.MyBookingsScreen;
import com.Membership.Automation.Utility.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyBookingsScreenSteps extends TestBase {

    MyBookingsScreen Bookings;
   public MyBookingsScreenSteps(){
       Bookings = new MyBookingsScreen(driver);
   }

    @When("I Click on Profile button icon")
    public void i_click_on_profile_button_icon() {
        // Write code here that turns the phrase above into concrete actions
        Bookings.profileButtonIcon();
    }
    @Then("I select Bookings")
    public void i_select_bookings() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Bookings.IClickOnBookings();
    }
    @Then("My Bookings Screen is displayed")
    public void my_bookings_screen_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        Bookings.MyBookingsScreenIsDisplayed();
    }

    @Then("by default Upcoming Tab Screen is displayed")
    public void by_default_upcoming_tab_screen_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
       Bookings.UpcomingTabScreen();
    }

    @And("verify the Upcoming Bookings list")
    public void verify_the_upcoming_bookings_list(){
        // Write code here that turns the phrase above into concrete actions
        Bookings.UpcomingBookingsScreen();
    }

    @Then("I Click On Past Tab Screen is displayed")
    public void i_click_on_past_tab_screen_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Bookings.PastTabScreen();
    }
    @Then("verify the Past Bookings list")
    public void verify_the_past_bookings_list() {
        // Write code here that turns the phrase above into concrete actions
        Bookings.PastBookingsListScreen();
    }

    @Then("I Click on anyone of Completed bookings")
    public void i_click_on_anyone_of_completed_bookings() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Bookings.SelectTheCourse();
    }
    @Then("Navigate Booking Details Screen is displayed")
    public void navigate_booking_details_screen_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        Bookings.BookingDetailsScreen();
    }

    @Then("I click Back to My Bookings button")
    public void i_click_back_to_my_bookings_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Bookings.BackToMyBookingsScreenButton();
    }

    @Then("I click on Cancel Booking Button\\(blue color)")
    public void i_click_on_cancel_booking_button_blue_color() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       Bookings.CancelBookingButton();
    }

    @Then("Pop Appears Are you sure you want to cancel this booking?")
    public void pop_appears_are_you_sure_you_want_to_cancel_this_booking() {
        // Write code here that turns the phrase above into concrete actions
        Bookings.PopAppearAreYouSure();
   }

    @Then("I Click on Cross\\(X) button")
    public void i_click_on_cross_x_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Bookings.CrossXButton();
    }

    @Then("Pop Appears Are you sure you want to cancel this booking? with Yes and No button")
    public void pop_appears_are_you_sure_you_want_to_cancel_this_booking_yes_no_button() {
        // Write code here that turns the phrase above into concrete actions
        Bookings.PopAppearAreYouSure();
    }

    @Then("I Click on Yes Button")
    public void i_click_on_yes_button() {
        // Write code here that turns the phrase above into concrete actions
        Bookings.ClickToYesButton();
    }

    @Then("Navigate to Cancel Booking Screen is displayed")
    public void navigate_to_cancel_booking_screen_is_displayed() throws InterruptedException {
       Bookings.CancelBookingScreen();
    }

    @Then("I Click on No Button")
    public void i_click_on_no_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Bookings.ClickToNoButton();
    }

    @Then("I Click on anyone Courses of Cancel Booking")
    public void i_click_on_anyone_courses_of_cancel_booking() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Bookings.PastCoursesCancelledText();
    }

}
