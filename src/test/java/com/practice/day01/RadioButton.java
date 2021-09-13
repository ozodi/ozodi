package com.practice.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadio = driver.findElement(By.id("blue"));
        // check if it's already selected
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());

        blueRadio.click();


        driver.quit();

    }


}
