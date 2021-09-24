package com.cybertek.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByLinkText {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://etsy.com");

        WebElement aboutLink = driver.findElement(By.partialLinkText("Halloween Shop"));

        aboutLink.click();




        driver.quit();


    }

}
