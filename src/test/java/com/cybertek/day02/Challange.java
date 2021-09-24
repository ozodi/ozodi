package com.cybertek.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Challange {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/registration_form");

        WebElement firstName = driver.findElement(By.cssSelector("input[name=firstname]"));
        firstName.sendKeys("Ozodi");
        Thread.sleep(1000);

        WebElement lastName = driver.findElement(By.cssSelector("input[name=lastname]"));
        lastName.sendKeys("Rumiev");
        Thread.sleep(1000);
        WebElement userName = driver.findElement(By.cssSelector("input[name=username]"));
        userName.sendKeys("Freedom0");
        Thread.sleep(1000);
        WebElement email = driver.findElement(By.cssSelector("input[name=email]"));
        email.sendKeys("rumiev0828@gmail.com");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.cssSelector("input[name=password]"));
        password.sendKeys("123456787");
        Thread.sleep(1000);
        WebElement phoneNumber = driver.findElement(By.cssSelector("input[name=phone]"));
        phoneNumber.sendKeys("571-000-0000");
        WebElement gender = driver.findElement(By.cssSelector("input[type=radio][value=male]"));
        gender.click();
        Thread.sleep(1000);
        WebElement birthDay = driver.findElement(By.cssSelector("input[name=birthday]"));
        birthDay.sendKeys("08/28/2001");
        Thread.sleep(1000);
        WebElement department = driver.findElement(By.cssSelector("select[name=department]"));
        Thread.sleep(1000);
        Select chose = new Select(department);
        chose.selectByVisibleText("Tresurer's Office");
        Thread.sleep(1000);
        WebElement jobTitle = driver.findElement(By.cssSelector("select[name=job_title]"));
        Thread.sleep(1000);
        Select sdet = new Select(jobTitle);
        sdet.selectByVisibleText("SDET");
        Thread.sleep(1000);
        WebElement language1 = driver.findElement(By.cssSelector("#inlineCheckbox1"));
        Thread.sleep(1000);
        language1.click();
        Thread.sleep(1000);
        WebElement language2 = driver.findElement(By.cssSelector("#inlineCheckbox2"));

        language2.click();

        Thread.sleep(1000);
        WebElement submit = driver.findElement(By.cssSelector("#wooden_spoon"));

        submit.submit();


        Thread.sleep(1000);

        driver.quit();









    }


}
