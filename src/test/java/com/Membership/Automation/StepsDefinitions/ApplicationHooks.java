package com.Membership.Automation.StepsDefinitions;


import com.Membership.Automation.Utility.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.IOException;

public class ApplicationHooks extends TestBase {

    //@Before
    //public void setUp() throws IOException {
    //    getDriver();
   // }


  @AfterStep
   public void takeScreenShot(Scenario scenario) {
        //if(scenario.isFailed()) {
            //System.out.println("capture Screenshot...");

          // String ScreenshotName= scenario.getName().replaceAll("","_");
            final byte [] Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(Screenshot, "image/png","image");
        //}

   }

    //@After(order=1)
    //public void tearDown(Scenario scenario) {
        //if(scenario.isFailed()) {
            //System.out.println("capture Screenshot...");

           // String ScreenshotName= scenario.getName().replaceAll("","_");
            //byte [] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
           // scenario.attach(sourcePath, "image/png",ScreenshotName);
        //}

    //}

    @After(order=0)
    public void quitBrowser() {
        driver.close();

    }
}
