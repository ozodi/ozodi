package com.cybertek.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathChallenge {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.xpath("//div/input[@id='user-name']"));
        userName.sendKeys("standard_user");

        Thread.sleep(1000);
        WebElement passWord = driver.findElement(By.xpath("//div/input[@id='password']"));
        passWord.sendKeys("secret_sauce");

        Thread.sleep(1000);
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='login-button']"));
        loginBtn.submit();

        Thread.sleep(1000);
        WebElement addToCart = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();

        Thread.sleep(1000);
        WebElement cart = driver.findElement(By.xpath("//div/a[@class='shopping_cart_link']"));
        cart.click();

        Thread.sleep(1000);
        WebElement checkOut = driver.findElement(By.xpath("//*[@id='checkout']"));
        checkOut.click();

        Thread.sleep(1000);
        WebElement firstName = driver.findElement(By.xpath("//*[@id='first-name']"));
        firstName.sendKeys("Ozodi");

        Thread.sleep(1000);
        WebElement lastName = driver.findElement(By.xpath("//*[@id='last-name']"));
        lastName.sendKeys("Rumiev");


        Thread.sleep(1000);
        WebElement zip = driver.findElement(By.xpath("//*[@id='postal-code']"));
        zip.sendKeys("22204");

        Thread.sleep(1000);
        WebElement conTinue = driver.findElement(By.xpath("//*[@id='continue']"));
        conTinue.click();

        WebElement finish = driver.findElement(By.xpath("//*[@id='finish']"));
        finish.click();

        WebElement back = driver.findElement(By.xpath("//*[@id='back-to-products']"));
        back.click();


        driver.quit();


































    }

}
