package com.cybertek.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByName {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));

        //enter selenium

        searchBox.sendKeys("selenium");

        WebElement searchBtn = driver.findElement(By.name("btnK"));

        searchBox.submit();

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        driver.quit();

    }

}
