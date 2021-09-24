package com.cybertek.tests;

import com.cybertek.testUtil.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P25_WebTables extends TestBase {

    @Test
    public void testWebTable(){

        driver.get("http://practice.cybertekschool.com/tables");

        // //table[@id='table1']/tbody/tr[1]/td[3]

        // //table[@id='table1']//td[.='Tim']
        String cell42Locator = "//table[@id='table1']/tbody/tr[1]/td[3]";


        WebElement cell42 = driver.findElement(By.xpath(cell42Locator));
        System.out.println("cell42 text = " + cell42.getText());

        String timCellLocator = "//table[@id='table1']//td[.='Tim']";
        WebElement cellTim = driver.findElement(By.xpath(timCellLocator));

        System.out.println("tim cell = " + cellTim.getText());


        //print out the all cell values of row 1
        //table[@id='table1']//tbody/tr[1]/td

        String row = "    //table[@id='table1']//tbody/tr[1]/td\n";
        List<WebElement> allRow = driver.findElements(By.xpath(row));

        for( WebElement each : allRow){
            System.out.println("each.getText() = " + each.getText());
        }




    }


}
