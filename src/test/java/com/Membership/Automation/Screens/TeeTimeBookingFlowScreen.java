package com.Membership.Automation.Screens;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TeeTimeBookingFlowScreen {

    WebDriver driver;
    public TeeTimeBookingFlowScreen(WebDriver driver){
        this.driver=driver;
    PageFactory.initElements(driver, this);
   }

    //WebElement of Email Sign in

    @FindBy(xpath = "//span[.='Sign in']")
    private WebElement SignInText;

    @FindBy(xpath = "//*[@id=\"identifierId\"]")
    private WebElement InputEmailField;

    @FindBy(xpath= "//*[@id=\"passwordNext\"]/div/button/div[3]")
    private WebElement EmailNextButton;

    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    private WebElement InputPasswordField;

    @FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button/span")
    private WebElement PasswordNextButton;


    //Email Sign in Functions
    public void EmailSignInScreen() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(SignInText));
        System.out.println(SignInText.getText());
        Thread.sleep(5);
    }

    public void EnterEmailDetails(String Email){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(InputEmailField));
        InputEmailField.click();
        InputEmailField.sendKeys(Email, Keys.ENTER);
    }

    public void IClickOnEmailNextButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(EmailNextButton));
        EmailNextButton.click();
        Thread.sleep(500);
    }

    public void EnterPasswordDetails(String Password) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(InputPasswordField));
        InputPasswordField.click();
        InputPasswordField.sendKeys(Password, Keys.ENTER);
        Thread.sleep(10);
    }

    public void IClickOnPasswordNextButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(PasswordNextButton));
        PasswordNextButton.click();
    }




}