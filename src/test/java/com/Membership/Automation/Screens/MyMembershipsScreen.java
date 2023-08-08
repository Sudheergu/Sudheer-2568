package com.Membership.Automation.Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static java.lang.Thread.sleep;

public class MyMembershipsScreen {

    WebDriver driver;
    public MyMembershipsScreen(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[contains(@href, 'memberships')]")
    public WebElement SelectMyMemberships;

    @FindBy(css = "a[class='link-item link-active']")
    public WebElement linkCalendarTodayMyMemberships2;

    @FindBy(xpath = "//a[@data-rb-event-key='memberships']")
    public WebElement MyMembershipsTab;

    @FindBy(xpath = "//h1[@class='my-memberships-title']")
    public WebElement MyMembershipsTitle;

    @FindBy(xpath = "//a[@data-rb-event-key='receipts']")
    public WebElement ReceiptsTab;

    @FindBy(css = ".receipts-title")
    public WebElement ReceiptsTitle;

    @FindBy(xpath = "//td[.='Monthly']")
    public WebElement Memberships;

    @FindBy(css = "h1[class='membership-details-title']")
    public WebElement MembershipsDetailsTitle;

    @FindBy(xpath = "//a[contains(@href, 'termsconditions')]")
    public WebElement TermsAndConditionsButton;

    @FindBy(css = "div[class='back-navigation-membership']")
    public WebElement BackButtonToMyMemberships;


    public void ISelectMyMemberships(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(SelectMyMemberships));
        SelectMyMemberships.click();
    }

    public void MyMembershipsScreenIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(linkCalendarTodayMyMemberships2));
        linkCalendarTodayMyMemberships2.click();

    }
    public void MyMembershipsTabScreen(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(MyMembershipsTab));
        MyMembershipsTab.click();

    }
    public void MyMembershipsTitleScreen(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(MyMembershipsTitle));
        System.out.println(MyMembershipsTitle.getText());

    }

    public void ClickOnReceiptsTabScreenIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(ReceiptsTab));
        ReceiptsTab.click();

    }
    
    public void ReceiptsInvoiceListScreen(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(ReceiptsTitle));
        System.out.println(ReceiptsTitle.getText());

    }

    public void SelectTheMemberships(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(Memberships));
        Memberships.click();
    }
    
    public void MembershipsDetailsScreen() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(MembershipsDetailsTitle));
        System.out.println(MembershipsDetailsTitle.getText());
        sleep(3000);
    }
    
    public void IClickToTermsAndConditions() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(TermsAndConditionsButton));
        TermsAndConditionsButton.click();
        sleep(3000);
    }

    public void NavigateToTermsAndConditionsScreenIsDisplayed() throws InterruptedException {
            // It will return the parent window name as a String
            String Parent_window = driver.getWindowHandle();
            Set<String> handles = driver.getWindowHandles();

            for(String handle : handles)
            {
                if(!Parent_window.equals(handle)) {
                    driver.switchTo().window(handle);
                    System.out.println(driver.switchTo().window(handle).getTitle().equalsIgnoreCase("Terms & Conditions"));
                    driver.close();
                }
            }
            sleep(2000);
            //switch to the parent window
            driver.switchTo().window(Parent_window);

    }

    public void IClickBackToMyMembershipsButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfAllElements(BackButtonToMyMemberships));
        BackButtonToMyMemberships.click();
        sleep(3000);
    }
    
   
    
    

    
    
}
