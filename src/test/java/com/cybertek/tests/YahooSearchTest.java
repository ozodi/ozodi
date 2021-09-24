package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class YahooSearchTest {

    WebDriver driver;

    @BeforeEach
    public void setupWebDriver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://search.yahoo.com/");
        Thread.sleep(2000);
    }

    @AfterEach
    public void closeBrowser(){
        System.out.println("@AfterEach closing the browser");
        driver.quit();
    }

    @Test
    public void testYahooSearchHomePage(){
        String expectedResult ="Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();
        assertEquals(expectedResult,actualTitle);
    }

    @Test
    public void testYahooSearchResultPage(){
        //search for selenium and hit enter
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='yschsp']"));
        searchBox.sendKeys("selenium" + Keys.ENTER);
        // assert the title start with selenium
        String actualTitle = driver.getTitle();
        assertTrue(actualTitle.startsWith("selenium"));

    }

}
