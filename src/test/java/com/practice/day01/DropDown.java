package com.practice.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");

        // Click to open "unusual" dropdown without select tag

        WebElement dropdownLink = driver.findElement(By.linkText("Dropdown link"));

        dropdownLink.click();

        WebElement itemGoogle = driver.findElement(By.linkText("Google"));

        itemGoogle.click();



/*
        // identify the dropdown with multiple selected item
        WebElement multiItem = driver.findElement(By.name("Languages"));
        // wrap this element into select object
        Select multiItemSelect = new Select(multiItem);

        // check if this object is a multi select list
        System.out.println("multiItemSelect.isMultiple() = "
                + multiItemSelect.isMultiple());

        multiItemSelect.selectByIndex(3);
        multiItemSelect.selectByValue("c#");
        multiItemSelect.selectByVisibleText("Java");

        // deselect item

        multiItemSelect.deselectByIndex(3);
        multiItemSelect.deselectByValue("c#");
        multiItemSelect.deselectByVisibleText("Java");
        multiItemSelect.deselectAll();


 */

        driver.quit();

    }

}
