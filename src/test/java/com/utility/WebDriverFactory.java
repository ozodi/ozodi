package com.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;

public class WebDriverFactory {

    public static WebDriver get(String browserName){
        WebDriver driver;
        switch (browserName.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver =new FirefoxDriver();
                break;
            default:
                System.out.println("Unknown browser type "+ browserName);
                driver = null;
        }

        driver.manage().window().maximize();
        return driver;
    }

}
