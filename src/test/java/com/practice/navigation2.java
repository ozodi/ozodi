package com.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.navigate.to(url)
        // dirver.get(url)
        driver.get("https://google.com");
        driver.get("https://amazon.com");

        //driver.navigate.back();
        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();



    }

}
