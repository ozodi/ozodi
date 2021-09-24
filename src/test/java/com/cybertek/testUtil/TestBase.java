package com.cybertek.testUtil;

import com.utility.WebDriverFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;

    @BeforeEach
    public void setUpBrowser(){
        driver = WebDriverFactory.get("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("@After all things ");
    }



}
