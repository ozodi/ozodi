package com.cybertek.tests;

import com.cybertek.testUtil.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NestedFrame extends TestBase {

    @Test
    public void nastedFrame(){

        driver.get("http://practice.cybertekschool.com/nested_frames");

//      main content  top, bottom
        // top -- > left, middle, right frame
        //


        //get the txt out of bottom
        driver.switchTo().frame("frame-bottom");

        WebElement bottomFrameBody = driver.findElement(By.tagName("body"));
        System.out.println("bottomFrameBody.getText() = " + bottomFrameBody.getText());

        // switch out to the parent frame
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");

        WebElement middleFrameBody = driver.findElement(By.tagName("body"));
        System.out.println("middleFrameBody.getText() = " + middleFrameBody.getText());


        driver.switchTo().parentFrame(); // now we are at top frame
        driver.switchTo().frame("frame-right");
        WebElement rightFrameBody = driver.findElement(By.tagName("body"));
        System.out.println("rightFrameBody.getText() = " + rightFrameBody.getText());

        // go back to default content
        driver.switchTo().defaultContent();



    }


}
