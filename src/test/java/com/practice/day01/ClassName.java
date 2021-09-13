package com.practice.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        // identify the span element with class name 'h1y'

        WebElement elm = driver.findElement(By.className("MV3Tnb"));
        System.out.println("elm.getText() = " + elm.getText());


        driver.quit();



    }

}
