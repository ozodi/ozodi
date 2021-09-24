package com.cybertek.tests;

import com.cybertek.testUtil.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P26_iFrameTest extends TestBase {

    @Test
    public void test_iFrame(){
        driver.get("http://practice.cybertekschool.com/iframe");

//        // identify the <p> element inside the frame
//
//        // switch to the iframe using index
//        driver.switchTo().frame(0);
        // switch to the iframe using id or name
       // driver.switchTo().frame("mce_0_ifr");

        //switch to the iframe using WebElement
        WebElement iframeElem = driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']"));
        driver.switchTo().frame(iframeElem);

        WebElement pTagElementInsideFrame = driver.findElement(By.tagName("p"));

        System.out.println("pTagElementInsideFrame = " + pTagElementInsideFrame.getText());

        driver.switchTo().defaultContent();// this will switch to top level html

      //  driver.switchTo().parentFrame();

        driver.findElement(By.linkText("Home")).click();


    }


}
