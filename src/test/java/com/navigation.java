package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cybertekschool.com/open_new_tab");
        // close method any current browser tab that in focus
        //driver.close();

        Thread.sleep(5000);
        // close all browser window open by driver

       driver.quit();

    }

}
