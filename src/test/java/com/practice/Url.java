package com.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // get the page source of html

        System.out.println("driver.getPageSource() = " + driver.getPageSource());

        driver.quit();
    }

}
