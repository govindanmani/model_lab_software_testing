package com.example;


import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
    

    WebDriver driver;

    @BeforeTest
    public void setupDriver() {
        driver = new ChromeDriver();
    }

    @Test
    void opentab() throws InterruptedException
    {
        driver.get("https://www.ixigo.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[1]/div[1]/div/button[2]")).click();
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div")).click();
        driver.findElement(
                By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/input"))
                .sendKeys("IDP - Independence");
        Thread.sleep(1000);
        driver.findElement(
                By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/li/div[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div")).click();
        driver.findElement(
                By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/input"))
                .sendKeys("DEL - New Delhi");
        Thread.sleep(1000);
        driver.findElement(
                By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/li/div[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/div")).click();
        Thread.sleep(2000);
        while (true) {
            String curr = driver.findElement(By.xpath(
                    "/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[3]/div/div[1]/div[1]/button[2]/span[1]"))
                    .getText();
            String s[] = curr.split(" ");
            String currMonth = s[0];
            String currYear = s[1];
            if (currMonth.equals("November") && currYear.equals("2024"))
                break;
            driver.findElement(
                    By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[3]/div/div[1]/div[1]/button[3]"))
                    .click();
            Thread.sleep(1000);
        }
        driver.findElement(By.xpath(
                "/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[3]/div/div[1]/div[2]/div[1]/div/div/div[2]/button[11]"))
                .click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/div"))
                .click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(
                "/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[3]/div/div[1]/div[2]/div[1]/div/div/div[2]/button[13]"))
                .click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[1]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(
                "/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/div[1]/div[2]/div/button[2]"))
                .click();
        driver.findElement(By.xpath(
                "/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/div[2]/div[2]/div/button[2]"))
                .click();
        driver.findElement(
                By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/div[5]/div/div[3]"))
                .click();
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[2]/button"))
                .click();

                Thread.sleep(5000);
                
                Thread.sleep(5000);
                
            }
            
            
            @AfterTest
            public void wrapUp() {
        // driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/button")).click();
        driver.quit();
    }
}
