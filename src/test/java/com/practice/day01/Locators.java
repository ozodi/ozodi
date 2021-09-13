package com.practice.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate to yahoo.com

        driver.get("https://yahoo.com");

        // identify and save the element

        WebElement inputBox =  driver.findElement(By.id("ybar-sbq"));

        // enter text hello

        inputBox.sendKeys("Hello");
        // click on the search batton
        WebElement submitKey = driver.findElement(By.id("ybar-search"));

        submitKey.click();

        Thread.sleep(2000);

        String pageTitle = driver.getTitle();
        System.out.println("page Title "+pageTitle);

        driver.quit();


    }

}
