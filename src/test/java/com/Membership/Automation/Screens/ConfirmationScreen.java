package com.Membership.Automation.Screens;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmationScreen {

    WebDriver driver;


    public ConfirmationScreen(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //@FindBy(css = "div[class$='purchase-message-desktop'] i[class*='success-icon']")
    //public WebElement iCheckCircle;

    @FindBy(css = "div[class$='purchase-message-desktop'] .confirmation-number")
    public WebElement spanConfirmationNumber;

    @FindBy(css = "div[class='borderless-button back-to-home-btn']")
    public WebElement BackToHomeButton;


    public void TeeTimeConfirmationNumber() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(spanConfirmationNumber));
        System.out.println(spanConfirmationNumber.getText());
    }

    public void ClickOnBackTOHomeButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(BackToHomeButton));
        BackToHomeButton.click();
        Thread.sleep(5000);
    }





    
}
