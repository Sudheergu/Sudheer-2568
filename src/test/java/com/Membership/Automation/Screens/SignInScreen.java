package com.Membership.Automation.Screens;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class SignInScreen {
    WebDriver driver;

    public SignInScreen(WebDriver driver) {
        // TODO Auto-generated constructor stub
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[class='primary menu-btn btn btn-primary']")
    public WebElement buttonDone;

    @FindBy(xpath="//a[@class='top-bar-link top-bar__margined']")
    public WebElement LogIn;

    @FindBy(xpath="//input[@id='email']")
    public WebElement emailField;

    @FindBy(xpath="//input[@id='password']")
    public  WebElement passwordField;

    @FindBy(xpath="//button[contains(@type, 'submit')]")
    public WebElement LogInbutton;

    @FindBy(xpath="//div[text()='Invalid email ']")
    public WebElement emailInvalidValidationMessage;

    @FindBy(xpath ="//label[@for='email']")
    public WebElement LabelofEmailfield;
    @FindBy(xpath="//div[text()='The email/password you entered is incorrect']")
    public WebElement emailorPasswordInvalidMessage;

    //@FindBy(xpath = "input[class='login-input form-control is-invalid']")
    // public WebElement EmailEmptyField;

    //@FindBy(xpath = "input[class='login-input form-control is-invalid']")
    // public WebElement PasswordEmptyField;

    @FindBy(xpath="//div[text()='Email is a required field']")
    public  WebElement Emailempty;

    @FindBy(xpath="//div[text()='Password is a required field']")
    public  WebElement Passwordempty;

    @FindBy(xpath ="//label[@for='password']")
    public WebElement LabelofPasswordField;

    @FindBy(xpath="//button[@type='submit']")
    public  WebElement LoginButtonDisable;

    @FindBy(xpath="//a[text()='Forgot your password?']")
    public  WebElement forgotyourPassword;

    @FindBy(xpath="//h2[text()='Forgot your password?']")
    public  WebElement forgotyourPasswordscreen;

    @FindBy(xpath="//a[@class='resend-unlock-instructions-link']")
    public  WebElement Didnotrecieveunlockinstruction;

    @FindBy(xpath="//h2[text()='Resend Unlock Instructions']")
    public  WebElement ResendUnlockInstructionsScreen;

    @FindBy(xpath="//input[@id='email']")
    public  WebElement forGotyourPasswordAndResendUnlockInstructionsEmailField;

    @FindBy(xpath="//button[@type='submit']")
    public  WebElement Sendlinkbutton;

    @FindBy(xpath ="//a[@class='back-link']")
    public WebElement BacktoSignlinkbutton;

    @FindBy(xpath ="//h2[text()='Login to your Account']")
    public WebElement BacktoLogintoyourAccountScreen;

    @FindBy(xpath ="//a[@class='sign-up-link']")
    public WebElement SignUpLinkButtonintheloginScreen;

    @FindBy(xpath ="//h2[text()='Sign Up']")
    public WebElement SignUpScreen;

    @FindBy(xpath ="//a[text()='Log in']")
    public WebElement BacktoLoginlinkbutton;

    public void ClickonCoursePoliciesDoneButton() throws InterruptedException {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfAllElements(buttonDone));
            buttonDone.click();
            Thread.sleep(3000);
    }

    public void IClickonProfileofLoginbutton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(LogIn));
        LogIn.click();
        Thread.sleep(5000);
    }

    public void signInDetails(String Email, String Password ) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(emailField));
        emailField.click();
        emailField.sendKeys(Email, Keys.ENTER);
        passwordField.click();
        passwordField.sendKeys(Password);
        Thread.sleep(5000);
    }
    public void IClickOnLogin() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(LogInbutton));
        LogInbutton.click();
        Thread.sleep(3000);
        //driver.close();
        //driver.quit();

    }

    public void emailInvalidValidationMessage() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(emailInvalidValidationMessage));
        System.out.println(emailInvalidValidationMessage.getText());
    }


    public void emialandPasswordInvalidMessage() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(emailorPasswordInvalidMessage));
        System.out.println(emailorPasswordInvalidMessage.getText());
    }

    public void IClickonlabelofPasswordField(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(LabelofPasswordField));
        LabelofPasswordField.click();
    }

    public void EmailAndPasswordEmptyemailValidationMessage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(Emailempty,Passwordempty,LoginButtonDisable));
        System.out.println(Emailempty.getText());
        System.out.println(Passwordempty.getText());
        System.out.println(LoginButtonDisable.getText());
        Thread.sleep(5000);
        //driver.close();
        //driver.quit();
    }

    public void clickOnForGotyourPassword() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(forgotyourPassword));
        forgotyourPassword.click();

    }

    public void forgotyourPasswordScreen() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(forgotyourPasswordscreen));
        Assert.assertTrue(forgotyourPasswordscreen.isDisplayed());
    }

    public void ClickonLabelofEmailfield() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(LabelofEmailfield));
        LabelofEmailfield.click();

    }
    public void ForgotyourPasswordandResendunlockinstructionsScreenEmailInvalidValidationMessage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(emailInvalidValidationMessage));
        System.out.println(emailInvalidValidationMessage.getText());
        Thread.sleep(8000);
        //driver.close();
    }

    public void ClickDidnotrecieveunlockinstructions() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(Didnotrecieveunlockinstruction));
        Didnotrecieveunlockinstruction.click();
    }

    public void ResendUnlockInstructionsScreen() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(ResendUnlockInstructionsScreen));
        Assert.assertTrue(ResendUnlockInstructionsScreen.isDisplayed());
    }

    public void forGotyourPasswordAndResendUnlockInstructionsEmailField( String existingEmail) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(forGotyourPasswordAndResendUnlockInstructionsEmailField));
        forGotyourPasswordAndResendUnlockInstructionsEmailField.click();
        forGotyourPasswordAndResendUnlockInstructionsEmailField.sendKeys(existingEmail, Keys.ENTER);
    }

    public void forGotyourPasswordAndResendUnlockInstructionsEmailFieldSendLinkButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
         wait.until(ExpectedConditions.visibilityOfAllElements(Sendlinkbutton));
        Sendlinkbutton.click();
        Thread.sleep(5000);
    }

    public void ClickonBacktoSignlinkbutton() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(BacktoSignlinkbutton));
        BacktoSignlinkbutton.click();

    }

    public void BacktoLogintoyourAccountScreen() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(BacktoLogintoyourAccountScreen));
        Assert.assertTrue(BacktoLogintoyourAccountScreen.isDisplayed());
        //System.out.println(BacktoLogintoyourAccountScreen.getText());
        //driver.close();
        //driver.quit();
    }

    public void SignUpLinkButtonintheloginScreen() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(SignUpLinkButtonintheloginScreen));
        SignUpLinkButtonintheloginScreen.click();
    }

    public void SignUpScreen() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(SignUpScreen));
        SignUpScreen.click();
        Thread.sleep(3000);
    }

    public void ClickonBacktoLoginLinkButton() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(BacktoLoginlinkbutton));
        BacktoLoginlinkbutton.click();
    }



}