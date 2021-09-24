package com.cybertek.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByAtribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");


        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");

        System.out.println("searchBox.getTagName() = "
                + searchBox.getTagName());

        System.out.println("searchBox.getAttribute(\"value\") = "
                + searchBox.getAttribute("value"));

        WebElement searchBtn  = driver.findElement(By.name("btnK"));

        System.out.println("searchBtn.getTagName() = "
                + searchBtn.getTagName());
        System.out.println("searchBtn.getAttribute(\"class\") = "
                + searchBtn.getAttribute("class"));



        driver.quit();

    }

}
