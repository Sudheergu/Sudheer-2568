package com.Membership.Automation.Screens;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class SignUpScreen {


    WebDriver driver;

    public SignUpScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@href, 'signup')]")
    public WebElement LinkSignUp;

    @FindBy(xpath = "//h2[contains(@class, 'card-title')]")
    public WebElement TitleOFSignUp;

    @FindBy(css = "input[id='email']")
    public WebElement inputEmail;

    @FindBy(css = "input[id='firstName']")
    public WebElement inputFirstName;

    @FindBy(css = "input[id='lastName']")
    public WebElement inputLastName;

    @FindBy(css = "input[id='password']")
    public WebElement inputPassword;

    @FindBy(css = "input[id='confirmPassword']")
    public WebElement inputConfirmPassword;

    @FindBy(css = "select[id='countryISO']")
    public WebElement selectCountryIso;

    @FindBy(css = "input[id='zipCode']")
    public WebElement inputZipCode;
    
    @FindBy(xpath = "//input[@id='user_captcha_input']")
    public WebElement Entercaptcha;

    @FindBy(xpath = "//*[@id='canv']")
    public WebElement canvasCanv;

    @FindBy(css = "button[type='submit']")
    public WebElement SignUpButton;

    public void ClickToSignUpButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(LinkSignUp));
        LinkSignUp.click();
    }

    public void NavigateToSignUpScreen() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(TitleOFSignUp));
        System.out.println(TitleOFSignUp.getText());
        sleep(2000);
    }
    
    public void SignUpDetails(String Email,String FirstName,String LastName, String Password, String ConfirmPassword, String ZipCode) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(inputEmail));
        inputEmail.click();
        inputEmail.sendKeys(Email,Keys.ENTER);
        sleep(3000);
        inputFirstName.click();
        inputFirstName.sendKeys(FirstName);
        sleep(3000);
        inputLastName.click();
        inputLastName.sendKeys(LastName);
        sleep(3000);
        inputPassword.click();
        inputPassword.sendKeys(Password);
        sleep(3000);
        inputConfirmPassword.click();
        inputConfirmPassword.sendKeys(ConfirmPassword);
        sleep(3000);
        selectCountryIso.click();
        Select drop = new Select(selectCountryIso);
        drop.selectByVisibleText("United States");
        //drop.selectByVisibleText("Afghanistan");
        sleep(3000);
        inputZipCode.click();
        inputZipCode.sendKeys(ZipCode);
        sleep(3000);
    }
    
    


    public void CapturedTheCaptcha() throws IOException, InterruptedException, TesseractException {

        try {
            // Take a screenshot of the captcha canvas element and save it to a file
            File src = canvasCanv.getScreenshotAs(OutputType.FILE);
            String path = "D:\\Intellij IDE Workspace\\Membership-Web-Automation-Testing\\captchaimages\\captcha.png";
            FileHandler.copy(src, new File(path));
            sleep(2000);

            // Use Tesseract OCR to read the captcha image from the file
            ITesseract image = new Tesseract();
            String captchaText = image.doOCR(new File(path));
            System.out.println("Captcha OCR done");
            System.out.println(captchaText);

            // Extract alphanumeric characters from the OCR text to get the captcha code
            String captchaCode = captchaText.replaceAll("[^a-zA-Z0-9]", "");
            System.out.println("Captcha code: " + captchaCode);

            // Find the input field for the captcha code and enter the code
            //WebElement captchaInput = driver.findElement(By.id("//input[@id='user_captcha_input']"));
            Entercaptcha.click();
            Entercaptcha.sendKeys(captchaCode,Keys.ENTER);
            sleep(2000);

        } catch (Exception e) {
            // Handle any exceptions that may occur
            System.out.println("Exception caught: " + e.getMessage());
        }

    }

    public void IClickOnSignUpButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(SignUpButton));
        SignUpButton.click();
        //sleep(4000);
    }

}