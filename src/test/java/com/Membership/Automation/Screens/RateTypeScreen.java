package com.Membership.Automation.Screens;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RateTypeScreen {

    WebDriver driver;
    public RateTypeScreen(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "h3[class$='mr-price'] i[class='arrow-price right-price']")
    public WebElement RateTypetileArrowPrice;

    @FindBy(xpath = "//h1[contains(@class, 'title')]")
    public WebElement Checkout_PaymentMethodsTitle;

    public void scrollDownatRateType() throws InterruptedException {
        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)","");
        Thread.sleep(8000);
        
    }

    public void SelectRateTypeTile(){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(RateTypetileArrowPrice));
        RateTypetileArrowPrice.click();
        
    }

    public void Checkout_PaymentMethodsScreen() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(Checkout_PaymentMethodsTitle));
        System.out.println(Checkout_PaymentMethodsTitle.getText());
        Thread.sleep(4000);
    }

}
