package com.cybertek.tests;

import com.cybertek.testUtil.TestBase;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class ForgotPasswordPage extends TestBase {

    @Test
    public void testForgetPassword(){

        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("akangankoy@icloud.com" + Keys.ENTER);

        String currentURL = driver.getCurrentUrl();
        assertTrue(currentURL.endsWith("email_sent"));

    }

}
