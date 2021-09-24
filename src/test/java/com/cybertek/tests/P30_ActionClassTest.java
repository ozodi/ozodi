package com.cybertek.tests;

import com.cybertek.testUtil.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;


public class P30_ActionClassTest extends TestBase {

    @Test
    public void testPerformHoverAction(){

        driver.get("http://practice.cybertekschool.com/hovers");

        //hover over to the first picture

        //identify the first element, verify the text displayed under

        /**
         *
         * //div[@class='figure'][1]
         *
         * //h5[.='name: user1']
         */

        WebElement firstImag = driver.findElement(By.xpath("//div[@class='figure'][1]"));

        WebElement firstImageText = driver.findElement(By.xpath("//h5[.='name: user1']"));
        System.out.println("Before the hover firstImageText.isDisplayed() = " + firstImageText.isDisplayed());
        assertFalse(firstImageText.isDisplayed());
        //create action class object
        Actions actions = new Actions(driver);
        actions.moveToElement(firstImag).perform();

        System.out.println("After the hover firstImageText.isDisplayed() = " + firstImageText.isDisplayed());
        assertTrue(firstImageText.isDisplayed());

/*
        WebElement thdImg = driver.findElement(By.xpath("//div[@class='figure'][3]"));

        WebElement thdImgText = driver.findElement(By.xpath("//h5[.='name: user3']"));

        System.out.println("thdImgText.isDisplayed() = " + thdImgText.isDisplayed());
        assertFalse(thdImgText.isDisplayed());

        actions.moveToElement(thdImg).perform();
        System.out.println("thdImgText.isDisplayed() = " + thdImgText.isDisplayed());

        assertTrue(thdImgText.isDisplayed());


 */
        System.out.println("END");




    }

    @Test
    public void testDragAndDrop () throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement smallCircle = driver.findElement(By.id("draggable"));
        WebElement bigCircle = driver.findElement(By.id("droptarget"));

        System.out.println("bigCircle.getText() = " + bigCircle.getText());

        Actions actions =  new Actions(driver);

       // actions.dragAndDrop(smallCircle,bigCircle).perform();

        actions.moveToElement(smallCircle).pause(1000)
                .clickAndHold().pause(1000)
                        .moveToElement(bigCircle).pause(1000)
                                .release()
                                        .perform();


        Thread.sleep(3000);

        assertEquals("You did great!",bigCircle.getText());


        System.out.println("END");


    }

    @Test
    public void testKeyboardAction(){

        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));

        //click on the element
        //hold down to the shift and enter text
        //release to the shift and enter text
        // hold down to command on mac, Control on window enter a to select all
        //send keys backspace



    }



}
