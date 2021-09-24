package com.cybertek.tests;

import com.cybertek.testUtil.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P5_popUps extends TestBase {

    @Test

    public void testAlert(){

        driver.get("http://practice.cybertekschool.com/javascript_alerts");

//       driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();


//        driver.switchTo().alert().accept(); // click ok button
//        Alert alertObj  = driver.switchTo().alert();
//        alertObj.accept();


        WebElement confirmBtn =  driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
//        confirmBtn.click();
//        driver.switchTo().alert().accept();
//        confirmBtn.click();
 //       driver.switchTo().alert().dismiss();




        WebElement promptBtn = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        promptBtn.click();

        Alert alertObj =driver.switchTo().alert();

        System.out.println("popup text is : " + alertObj.getText());
        driver.switchTo().alert().sendKeys("Hello There");
        driver.switchTo().alert().accept();

        System.out.println("END");


    }


}
