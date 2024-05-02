package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        // System.out.println( "Hello World!" );
       
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000/");
        
        String h= driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/input")).getText();
         Thread.sleep(5000);

        driver.get("https://chat.openai.com/auth/login");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/div/button[2]/div")).click();

        driver.findElement(By.xpath("/html/body/div/div/main/section/div[2]/div[1]/input")).sendKeys("mkmaniii984@gmail.com");
        driver.findElement(By.xpath("/html/body/div/div/main/section/div[2]/button")).click();
        
        driver.findElement(By.xpath("/html/body/div/main/section/div/div/div/form/div[1]/div[1]/div/div[2]/div/input")).sendKeys("ManiKannan@2004");
        driver.findElement(By.xpath("/html/body/div/div/main/section/div[2]/button")).click();

    }
}
