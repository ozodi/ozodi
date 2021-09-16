package com.practice.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearch {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://search.yahoo.com/");
        //CSS selector  ID
        WebElement searchBox = driver.findElement(By.cssSelector("#yschsp"));

        searchBox.sendKeys("css selector");

        WebElement xKey = driver.findElement(By.cssSelector("span.sprite"));



        xKey.click();

        searchBox.sendKeys("selenium locators");

        WebElement searchBtn = driver.findElement(By.cssSelector("button>span[title=Search]"));


        searchBtn.click();




        driver.quit();







    }

}
