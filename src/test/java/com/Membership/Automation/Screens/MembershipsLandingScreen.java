package com.Membership.Automation.Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class MembershipsLandingScreen {

    WebDriver driver;
    public MembershipsLandingScreen(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@href, 'membership')]")
    public WebElement linkMembershipsButton;

    @FindBy(xpath = "/html/body/div/div/main/div/div/div[3]/div/div[2]/div[3]/div/div[1]/div/header/div[2]/span[1]")
    public WebElement NavigateToMembershipLandingScreenProgramBenefits;

    @FindBy(css = "button[id=' Memberships Automation Plan Club-1']")
    public WebElement buttonMembershipsAutomationPlanClub;

    @FindBy(xpath = "//a[contains(@class, 'choose-plan-btn')]")
    public WebElement SubscribeButton;

    @FindBy(css = "button[class*='purchase-button']")
    public WebElement buttonContinue;

    public void IClickToMembershipsButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(linkMembershipsButton));
        linkMembershipsButton.click();
    }

    public void NavigateToMembershipLandingScreen() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(NavigateToMembershipLandingScreenProgramBenefits));
        System.out.println(NavigateToMembershipLandingScreenProgramBenefits.getText());
        sleep(3000);
    }

    public void SelectedTheMembershipsPlanClub(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(buttonMembershipsAutomationPlanClub));
        //System.out.println(NavigateToMembershipLandingScreenProgramBenefits.getText());
        buttonMembershipsAutomationPlanClub.click();
    }

    public void IClickToSubscribeButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(SubscribeButton));
        //System.out.println(NavigateToMembershipLandingScreenProgramBenefits.getText());
        SubscribeButton.click();
    }
    
    public void IClickToContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(buttonContinue));
        buttonContinue.click();
    }

}
