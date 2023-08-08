package com.Membership.Automation.Screens;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class MyBookingsScreen {

    WebDriver driver;
    public MyBookingsScreen(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[class*='logged-username-section']")
    public WebElement ProfileButton;

    @FindBy(xpath = "//a[contains(@href, 'bookings')]")
    public WebElement linkStarBookings;

    @FindBy(xpath ="//span[text()='Bookings']")
    public WebElement BookingsHeaderText;

    @FindBy(xpath = "//a[text()='Upcoming']")
    public WebElement UpcomingTab;

    @FindBy(xpath = "//h1[contains(@class, 'bookings')]")
    public WebElement UpcomingBookings;

    @FindBy(xpath = "//a[text()='Past']")
    public WebElement PastTab;

    @FindBy(xpath = "//h1[contains(@class, 'past')]")
    public WebElement PastBookings;

    @FindBy(xpath = "//td[.='Test course 2']")
    public  WebElement Course;

    @FindBy(xpath = "//h1[@class='booking-details-title']")
    public WebElement BookingDetails;

    @FindBy(xpath = "//div[contains(@class, 'back-navigation')]")
    public WebElement BackToMyBookingsButton;

    @FindBy(xpath = "//button[contains(@class, 'cancel-btn')]")
    public WebElement buttonCancelBooking;

    @FindBy(xpath = "//p[contains(@class, 'mb-0')]")
    public WebElement AreYouSureWant;

    @FindBy(xpath = "//span[contains(@aria-hidden, 'true')]")
    public WebElement CrossButton;

    @FindBy(css = "button[class='primary cancel-button btn btn-primary']")
    public WebElement YesButton;

    @FindBy(css = ".cancelled-label")
    public WebElement CancelledText;

    @FindBy(css = "button[class='secondary cancel-button btn btn-primary']")
    public WebElement NoButton;

    @FindBy(xpath = "//td[text()='Cancelled']")
    public WebElement PastCancelledText;

    public void profileButtonIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(ProfileButton));
        ProfileButton.click();
    }

    public void IClickOnBookings() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(linkStarBookings));
        linkStarBookings.click();
        sleep(5000);
    }
    
    public void MyBookingsScreenIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(BookingsHeaderText));
        //Assert.assertTrue(BookingsText.isDisplayed());
        System.out.println(BookingsHeaderText.getText());
    }

    public void UpcomingTabScreen(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(UpcomingTab));
        UpcomingTab.click();
    }

    public void UpcomingBookingsScreen(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(UpcomingBookings));
        System.out.println(UpcomingBookings.getText());
    }

    public void PastTabScreen() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(PastTab));
        PastTab.click();
        sleep(5000);
    }
    public void PastBookingsListScreen(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(PastBookings));
        System.out.println(PastBookings.getText());
    }

    public void SelectTheCourse() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(Course));
        Course.click();
        sleep(5000);
    }
    public void BookingDetailsScreen(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(BookingDetails));
        //Assert.assertTrue(BookingDetails.isDisplayed());
        System.out.println(BookingDetails.getText());

    }

    public void BackToMyBookingsScreenButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(BackToMyBookingsButton));
        BackToMyBookingsButton.click();
        sleep(4000);
    }

    public void CancelBookingButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(buttonCancelBooking));
        buttonCancelBooking.click();
        sleep(4000);
    }

    public void PopAppearAreYouSure(){
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(AreYouSureWant));
        Assert.assertTrue(AreYouSureWant.isDisplayed());
    }
    
    public void CrossXButton() throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(CrossButton));
        CrossButton.click();
        sleep(3000);
    }

    public void ClickToYesButton(){
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(YesButton));
        YesButton.click();
    }
    public void ClickToNoButton() throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(NoButton));
        NoButton.click();
        sleep(3000);
    }

    public void CancelBookingScreen() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(CancelledText));
        System.out.println(CancelledText.getText());
        sleep(3000);
    }

    public void PastCoursesCancelledText() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(PastCancelledText));
        PastCancelledText.click();
        sleep(3000);
    }



}
