package com.cybertek.tests;

import com.cybertek.testUtil.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P28_Synchronization_ImplicitWait extends TestBase {


    private Object assertEquals;

    @Test
    public void testSlowElement() throws InterruptedException {




        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        // click on remove button
        driver.findElement(By.xpath("//button[.='Remove']")).click();


        // identify the its gone element

        WebElement itsGone  = driver.findElement(By.id("message"));
        System.out.println("itsGone.getText() = " + itsGone.getText());
        //assert the text is it's gone
        assertEquals("It's gone!" , itsGone.getText());

    }


}
