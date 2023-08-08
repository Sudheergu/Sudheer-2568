package com.Membership.Automation.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class TestBase {

    public static WebDriver driver;


    public static WebDriver getDriver() throws  IOException {

        Properties prop= PropertyLoader.loadData();
        String browserName=prop.getProperty("Br" +
                "" +
                "owser");
        String env=prop.getProperty("Environment");
        if(browserName.equals("Chrome"))
        {
            //System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            //options.addArguments("--headless");
            //options.addArguments("--window-size=1280,800");
            driver = new ChromeDriver(options);
        }
        else if (browserName.equals("Firefox"))
        {
            //firefox code
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();

        }
        else if (browserName.equals("MicrosoftEdge"))
        {
    		//IE code
            WebDriverManager.edgedriver().setup();
            driver= new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        return driver;
    }
//public static WebDriver CloseDriver() {
    //driver.close();
   // }

}