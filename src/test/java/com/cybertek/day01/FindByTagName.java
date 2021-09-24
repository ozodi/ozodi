package com.cybertek.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByTagName {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebElement firstLnk = driver.findElement(By.tagName("a"));

        System.out.println("firstLnk.getText() = "
                + firstLnk.getText());

        // find Element method will return List



        driver.quit();


    }

}
