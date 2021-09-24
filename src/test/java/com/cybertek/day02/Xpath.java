package com.cybertek.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();

        driver.get("https://search.yahoo.com/");

        // use xpath to identify search box and enter "xpath"
        Thread.sleep(1000);
        WebElement searchBox = driver.findElement(By.xpath("//div/input[@type='text' and @id='yschsp']"));
        searchBox.sendKeys("xpath");

        // click on x icon to clear out the text
        Thread.sleep(1000);
        WebElement xIcon = driver.findElement(By.xpath("//button/span[@class='sprite']"));
        xIcon.click();

        //enter "selenium locators" into search box
        Thread.sleep(1000);
        searchBox.sendKeys("selenium locators");

        //identify search icon and click on it
        Thread.sleep(1000);
        WebElement searchBtn = driver.findElement(By.xpath("//button/span[@title='Search']"));
        searchBtn.submit();

        driver.quit();




    }

}
