package com.cybertek.tests;

import com.cybertek.testUtil.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class P28_FileUpload extends TestBase {

    @Test
    public void testFileUpload() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/upload");




        // find the file directory or path from your computer
        String filePath ="C:\\Users\\Ozodi Rumiev\\OneDrive\\Desktop\\STORY-P-1.jpg";
        // locating the input filed
        driver.findElement(By.id("file-upload")).sendKeys(filePath);
        // find the submit button and click on it
        driver.findElement(By.id("file-submit")).click();


        Thread.sleep(2000);
        WebElement massage =driver.findElement(By.cssSelector("div>h3"));
        assertTrue( massage.isDisplayed());

        System.out.println("End");




    }


}
