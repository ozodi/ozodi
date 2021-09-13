package com.practice.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Challange {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://saucedemo.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());

        WebElement userName =  driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("secret_sauce");

        WebElement submitBtn = driver.findElement(By.name("login-button"));
        submitBtn.submit();

        WebElement name = driver.findElement(By.linkText("Sauce Labs Backpack"));
        System.out.println("name.getText() = " + name.getText());

        WebElement price= driver.findElement(By.className("inventory_item_price"));
        System.out.println("price.getText() = " + price.getText());

        List<WebElement> allProductTitle = driver.findElements(By.className("inventory_item_name"));
        System.out.println("allProductTitle.size() = " + allProductTitle.size());
        // print out the all product title
        for(WebElement eachProductTitle : allProductTitle){
            String productTitleText = eachProductTitle.getText();
            System.out.println("title "+ productTitleText);
        }

        WebElement shopCart = driver.findElement(By.className("shopping_cart_container"));
        shopCart.click();

        Thread.sleep(5000);

        WebElement back = driver.findElement(By.id("continue-shopping"));
        back.click();


        WebElement some = driver.findElement(By.id("react-burger-menu-btn"));
        some.click();
        WebElement logOff = driver.findElement(By.linkText("Logout"));
        logOff.submit();

        driver.quit();
    }

}
