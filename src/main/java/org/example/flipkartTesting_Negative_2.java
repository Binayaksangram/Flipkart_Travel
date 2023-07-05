package org.example;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class flipkartTesting_Negative_2 {


    public static void main(String[] args) throws InterruptedException {



        //009_Verify "destination cannot be empty"message is displayed
        String expectedText_To="destination cannot be empty";

        System.setProperty("webdriver.chrome.driver","C:\\Users\\binayaksangram.patta\\OneDrive - HCL Technologies Ltd\\Desktop\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Travel')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[contains(text(),'From')]/parent::div/input")).click();
        driver.findElement(By.xpath("//label[contains(text(),'From')]/parent::div/input")).sendKeys("Bangalore");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[contains(text(),'From')]/parent::div/input")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//label[contains(text(),'From')]/parent::div/input")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='_3ar16u'][1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[contains(text(),'30')])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(.,'Done')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(.,'SEARCH')]/parent::button")).click();
        Thread.sleep(2000);
        String expectedText=driver.findElement(By.xpath("//div[contains(text(),'destination cannot be empty')]")).getText();
        Assert.assertEquals(expectedText_To,expectedText);


    }




}
