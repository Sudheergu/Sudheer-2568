package com.Membership.Automation.Screens;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class B2B_SignInScreenScreen {

    WebDriver driver;

    public B2B_SignInScreenScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[contains(@id, 'email')]")
    public WebElement inputEmail;

    @FindBy(xpath = "//input[contains(@id, 'password')]")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement LoginButton;

    @FindBy(xpath = "//a[@href='/programs']")
    public WebElement Programs;

    public void B2B_SignInDetails(String Email,String Password) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(inputEmail));
        inputEmail.click();
        inputEmail.sendKeys(Email, Keys.ENTER);
        sleep(3000);
        inputPassword.click();
        inputPassword.sendKeys(Password);
        sleep(3000);

    }

    public void ClickToLogInButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(LoginButton));
        LoginButton.click();
    }

    public void NavigateToProgramModule() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(Programs));
        Programs.click();
        sleep(8000);
    }


}
