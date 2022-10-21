package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
     Creating a private constructor, so we are closing access to the object of this class
     from outside of any classes
     */
    private Driver(){}

    /*
    Making our 'driver' instance private, so that it is not reachable from outside of any class
    We make it static, because we want it to run before anyting else,
    also we will use it in static method
     */
    private static WebDriver driver;

    /*
    Create re-usable utility method which will return same driver instance when we call it.
     */
    public static WebDriver getDriver(){

        if(driver == null){  // if driver/browser was never opened

        String browserType = ConfigurationReader.getProperty("browser");

        /*
        Depending on the browserType our switch statement will determine
        to open specific type of browser/driver
         */
        switch(browserType){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
        }
        }

    // Same driver instance will be returned every time we call Driver.getDriver() method
       return driver;

    }


    public static void closeDriver(){
        if(driver!=null) {
            driver.quit(); // this line will kill the session. value will noy be null
            driver = null;
        }
    }

}
