package com.Membership.Automation.Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class PaymentMethodsScreen {


    WebDriver driver;


    public PaymentMethodsScreen(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//a[contains(@href, 'payment')]")
    public WebElement linkCreditCardPaymentMethods;

    @FindBy(css = "a[class*='link-active']")
    public WebElement linkCreditCardPaymentMethods2;

    @FindBy(css = "html > body > div > div > main > div > section > main > div:nth-of-type(2) > button")
    public WebElement ButtonRemove;

    @FindBy(xpath = "//h3[text()='Saved Cards']")
    public WebElement TitleOFSavedCards;





    public void ISelectPaymentMethods(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(linkCreditCardPaymentMethods));
        linkCreditCardPaymentMethods.click();
    }

    public void NavigateToPaymentMethodsScreen() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(linkCreditCardPaymentMethods2));
        System.out.println(linkCreditCardPaymentMethods2.getText());
        Thread.sleep(5000);
    }

    public void clickOnRemoveButtonOfCard() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(ButtonRemove));
        ButtonRemove.click();
        sleep(3000);
    }

    public void ThenAgainBackToPaymentMethodsScreen(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(TitleOFSavedCards));
        System.out.println(TitleOFSavedCards.getText());
    }

    public void CapturedTheInvalidCardDetailsErrorMessage(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(TitleOFSavedCards));


    }






}

