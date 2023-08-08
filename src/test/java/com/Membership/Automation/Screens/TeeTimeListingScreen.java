package com.Membership.Automation.Screens;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TeeTimeListingScreen {

    WebDriver driver;

    public TeeTimeListingScreen(WebDriver driver) {
        // TODO Auto-generated constructor stub
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "select[id='course']")
    public WebElement selectCourse;

    @FindBy(css = "div[class='date-arrow-item-container'] i[class$='right']")
    public WebElement  DateRightArrow;

    @FindBy(xpath = "/html/body/div/div/main/div/section/div[4]/div/div[3]/div/div/div")
    public WebElement SelectinPlayers;

    @FindBy(xpath = "/html/body/div/div/main/div/section/div[4]/div/div[4]/div/div/div")
    public WebElement SelectHoles9or18;

    @FindBy(css = "img[class='search-btn search-btn-img']")
    public WebElement SearchButton;

    @FindBy(xpath = "/html/body/div/div/main/div/section/div[5]/div[2]/ul/li[3]/div[2]/i")
    public WebElement TeetimetileArrowPrice;

    @FindBy(xpath = "//span[@class='section-text']")
    public WebElement spanAvailableRates;
    
   @FindBy(xpath = "//span[@class='option-label']")
   public WebElement PlayersSelection;

    @FindBy(xpath = "//span[.='9 Holes']")
    public WebElement HolesSelection;

    public void SelectCourses() throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(selectCourse));
        selectCourse.click();
        Select drop = new Select(selectCourse);
        Thread.sleep(4000);
        drop.selectByVisibleText("Trophy Club of Apalachee");
        Thread.sleep(6000);
    }

    public void SelectDateonRightArrow() throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(DateRightArrow));
        DateRightArrow.click();
        DateRightArrow.click();
        Thread.sleep(6000);
    }

    public void SelectPlayers() throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(SelectinPlayers));
        SelectinPlayers.click();
        //System.out.println(PlayersSelection.getText());
        Select drop = new Select(SelectinPlayers);
        Thread.sleep(4000);
        drop.selectByValue("1");
        Thread.sleep(6000);
    }

    public void SelectHoles() throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(SelectHoles9or18));
        SelectHoles9or18.click();
        //System.out.println(HolesSelection.getText());
        Select drop = new Select(SelectHoles9or18);
        Thread.sleep(4000);
        drop.selectByVisibleText("18 Holes");
        Thread.sleep(6000);
    }

    public void ClickonSearchbutton() throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(SearchButton));
        SearchButton.click();
        Thread.sleep(8000);

    }

    public void scrollDownatTeeTimeScreen() throws InterruptedException {
        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,20000)","");
        Thread.sleep(8000);

    }

    public void SelectTeeTimeTile(){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(TeetimetileArrowPrice));
        TeetimetileArrowPrice.click();
    }

    public void RatetypeScreen() throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(spanAvailableRates));
        System.out.println(spanAvailableRates.getText());
        Thread.sleep(3000);
    }

    
    
    
    
}




