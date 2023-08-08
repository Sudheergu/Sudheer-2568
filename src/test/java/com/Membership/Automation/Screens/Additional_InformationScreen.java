package com.Membership.Automation.Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Additional_InformationScreen {

    WebDriver driver;

    public Additional_InformationScreen(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@href, 'additional')]")
    public WebElement linkInfoAdditionalInformation;

    @FindBy(css = "a[class$='link-active']")
    public WebElement linkInfoAdditionalInformation2;

    @FindBy(css = "select[id='select-additional-info']")
    public WebElement selectAdditionalInfo;

    @FindBy(css = "button[class*='btn-primary']")
    public WebElement ButtonView;

    @FindBy(xpath = "//head[title='Trophy Club Apalachee (Demo) - Online Booking']")
    public WebElement TitleOfForeUpSoftware;


    public void ISelectAdditionalInformation(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(linkInfoAdditionalInformation));
        linkInfoAdditionalInformation.click();
    }

    public void NavigateToAdditionalInformationScreen() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(linkInfoAdditionalInformation2));
        linkInfoAdditionalInformation2.click();
        Thread.sleep(4000);

    }

    public void SelectCourseToViewAdditionalInformation(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(selectAdditionalInfo));
        selectAdditionalInfo.click();
        //Select drop = new Select(selectAdditionalInfo);
        //drop.selectByVisibleText("Trophy Club Apalachee(Demo)");
    }

    public void IClickOnViewButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(ButtonView));
        ButtonView.click();
        Thread.sleep(8000);
    }

    public void NavigateToForeUpSoftwareOfUserDetailsScreen() throws InterruptedException {
        // It will return the parent window name as a String
        String Parent_window = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();

        for(String handle : handles)
        {
            if(!Parent_window.equals(handle)) {
                driver.switchTo().window(handle);
                System.out.println(driver.switchTo().window(handle).getTitle().equalsIgnoreCase("Trophy Club Apalachee (Demo) - Online Booking)"));
                driver.close();
            }
        }
        Thread.sleep(2000);
        //switch to the parent window
        driver.switchTo().window(Parent_window);


        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOfAllElements(TitleOfForeUpSoftware));
        //System.out.println(TitleOfForeUpSoftware.getText());
    }

}

