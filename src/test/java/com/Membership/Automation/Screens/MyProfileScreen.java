package com.Membership.Automation.Screens;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class MyProfileScreen {

    WebDriver driver;
    public MyProfileScreen(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[contains(@href, 'profile')]")
    public WebElement linkAccountCircleMyProfile;

    @FindBy(xpath = "//span[text()='My profile']")
    public WebElement MyProfileHeaderText;

    @FindBy(css = "button[class='borderless-button']")
    public WebElement EditButton;

    @FindBy(css = "h1[class='user-name']")
    public WebElement ProfileNameText;

    @FindBy(css = "input[id='firstName']")
    public WebElement EnterFirstName;

    @FindBy(css = "input[id='lastName']")
    public WebElement EnterLastName;

    @FindBy(css = "input[id='zipCode']")
    public WebElement EnterZipCode;

    @FindBy(css = "select[id='countryISO']")
    public WebElement selectCountry;

    //@FindBy(xpath= "//button[@loading='false']")
    //public WebElement buttonSaveChanges;

    @FindBy(css = "input[id='currentPassword']")
    public WebElement EnterCurrentPassword;

    @FindBy(css = "input[id='password']")
    public WebElement EnterNewPassword;

    @FindBy(css = "input[id='passwordConfirmation']")
    public WebElement EnterConfirmationPassword;

    @FindBy(css = "html > body > div:nth-of-type(1) > div > main > div > section > main > div > form:nth-of-type(1) > div:nth-of-type(4) > button:nth-of-type(2)")
    public WebElement buttonCancel;

    @FindBy(css = "button[loading='false']")
    public WebElement ProfileSaveChangesButton;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/section/main/div/form[2]/div[4]/button[1]")
    public WebElement PasswordSaveChangesButton;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/section/main/div/form[2]/div[4]/button[2]")
    public WebElement CancelButton2;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/section/main/div/form[2]/div[1]/div")
    public WebElement CurrentPasswordRequiredFieldValidation;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/section/main/div/form[2]/div[2]/div")
    public WebElement NewPasswordRequiredFieldValidation;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/section/main/div/form[2]/div[3]/div")
    public WebElement ConfirmPasswordRequiredFieldValidation;

    @FindBy(xpath = "//label[@for='passwordConfirmation']")
    public WebElement labelConfirmPassword;



    public void IClickOnMyProfile(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(linkAccountCircleMyProfile));
        linkAccountCircleMyProfile.click();
    }

    public void MyProfileScreenisdisplayed() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(MyProfileHeaderText));
        MyProfileHeaderText.click();
        System.out.println(MyProfileHeaderText.getText());
        Thread.sleep(3000);
    }

    public void IClickOnEditButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(EditButton));
        EditButton.click();
        Thread.sleep(3000);

    }
    public void EditMyProfileScreen() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(ProfileNameText));
        System.out.println(ProfileNameText.getText());
        Thread.sleep(3000);
    }

    public void EditDetailsOfMyProfile(String FirstName,String LastName,String ZipCode) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(EnterFirstName));
        EnterFirstName.click();
        EnterFirstName.clear();
        Thread.sleep(2000);
        EnterFirstName.sendKeys(Keys.DELETE);
        EnterFirstName.sendKeys(FirstName, Keys.ENTER);
        //EnterLastName.click();
        EnterLastName.clear();
        EnterLastName.sendKeys(LastName);
        selectCountry.click();
        Select drop = new Select(selectCountry);
        Thread.sleep(4000);
        drop.selectByValue("AF");
        Thread.sleep(6000);
        //EnterZipCode.click();
        EnterZipCode.clear();
        EnterZipCode.sendKeys(ZipCode,Keys.ENTER);
        Thread.sleep(3000);
    }

    public void ChangePassword(String CurrentPassword,String NewPassword,String ConfirmationPassword) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(EnterCurrentPassword));
        EnterCurrentPassword.click();
        EnterCurrentPassword.sendKeys(CurrentPassword,Keys.ENTER );
        EnterNewPassword.click();
        EnterNewPassword.sendKeys(NewPassword);
        EnterConfirmationPassword.click();
        EnterConfirmationPassword.sendKeys(ConfirmationPassword);
        Thread.sleep(2000);

    }

    public void EmptyFieldValidationOfPasswordChanges() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(EnterCurrentPassword));
        System.out.println(CurrentPasswordRequiredFieldValidation.getText());
        System.out.println(NewPasswordRequiredFieldValidation.getText());
        labelConfirmPassword.click();
        System.out.println(ConfirmPasswordRequiredFieldValidation.getText());
        Thread.sleep(4000);

    }

    public void MyProfileSaveChangesButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(ProfileSaveChangesButton));
        ProfileSaveChangesButton.click();
        Thread.sleep(8000);
    }

    public void PasswordSaveChangesButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElements(PasswordSaveChangesButton));
        PasswordSaveChangesButton.click();
        System.out.println(PasswordSaveChangesButton.getText());
        //Thread.sleep(15000);
    }

    public void clickOnCancelButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(CancelButton2));
        CancelButton2.click();
        Thread.sleep(8000);
    }





}