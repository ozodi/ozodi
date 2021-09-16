package com.practice.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssSelector {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver  =  new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/registration_form");





        WebElement fristName = driver.findElement(By.cssSelector("div>input[name=firstname]"));

        fristName.sendKeys("Ozodi");

        WebElement c = driver.findElement(By.cssSelector("#inlineCheckbox1"));

        System.out.println("c.isSelected() = " + c.isSelected());

        c.click();

        System.out.println("c.isSelected() = " + c.isSelected());


        WebElement jobTitle = driver.findElement(By.cssSelector("select[name=job_title]"));

        jobTitle.click();

        Select sdet = new Select(jobTitle);

        sdet.selectByVisibleText("SDET");

        WebElement radio = driver.findElement(By.cssSelector("input[type=radio][name=gender][value=male]"));

        radio.click();



        driver.quit();



    }


}
