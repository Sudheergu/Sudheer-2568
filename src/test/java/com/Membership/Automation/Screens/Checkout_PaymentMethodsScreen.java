package com.Membership.Automation.Screens;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Checkout_PaymentMethodsScreen {

    WebDriver driver;
    public Checkout_PaymentMethodsScreen(WebDriver driver){
    this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement EnterFirstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement EnterLastName;

    @FindBy(xpath = "//iframe[contains(@id, 'number')]")
    public WebElement EnterCardNumber;

    @FindBy(xpath = "//input[contains(@placeholder, 'MM/YYYY')]")
    public WebElement EnterExpirationDate;

    @FindBy(xpath = "//iframe[contains(@id, 'cvv')]")
    public WebElement EnterCVV;

    @FindBy(css = "input[name='zipCode']")
    public WebElement EnterZipCode;

    @FindBy(xpath = "//button[contains(@id, 'submit-button')]")
    public WebElement SaveCardButtonToSubmit;

    @FindBy(css = "div[class*='custom-radio']")
    public WebElement CheckBoxOfSaveCards;

    @FindBy(css = "div[class*='custom-checkbox']")
    public WebElement CheckBoxTermsAndConditions;

    @FindBy(xpath = "//button[contains(@class, 'purchase')]")
    public WebElement BookNowButton;

    @FindBy(css = "div[class$='purchase-message-desktop'] .message-title")
    public WebElement PaymentCompleteTitleAtConfirmationScreen;
    
    
    
    public void EnterNewCardDetails(String FirstName,String LastName,String CardNumber,String ExpirationDate,String CVV,String ZipCode) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(EnterFirstName));
        EnterFirstName.click();
        EnterFirstName.sendKeys(FirstName, Keys.ENTER);
        EnterLastName.click();
        EnterLastName.sendKeys(LastName);
        EnterCardNumber.click();
        EnterCardNumber.sendKeys(CardNumber);
        EnterExpirationDate.click();
        EnterExpirationDate.sendKeys(ExpirationDate);
        EnterCVV.click();
        EnterCVV.sendKeys(CVV);
        EnterZipCode.click();
        EnterZipCode.sendKeys(ZipCode);
        Thread.sleep(2000);
    }
    
    public void ClickOnSaveCardButtonToSubmit() throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(SaveCardButtonToSubmit));
        SaveCardButtonToSubmit.click();
        Thread.sleep(4000);
    }

    public void ClickOnCheckBoxOfSaveCards(){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(CheckBoxOfSaveCards));
        CheckBoxOfSaveCards.click();
    }
    
    public void ClickOnCheckBoxTermsAndConditions() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(CheckBoxTermsAndConditions));
        CheckBoxTermsAndConditions.click();
        Thread.sleep(2000);
    }

    public void ClickOnBookNowButton(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(BookNowButton));
        BookNowButton.click();
    }

    public void ConfirmationScreen() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(PaymentCompleteTitleAtConfirmationScreen));
        System.out.println(PaymentCompleteTitleAtConfirmationScreen.getText());
        Thread.sleep(3000);
    }

}
