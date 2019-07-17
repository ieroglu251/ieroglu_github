package com.vytrack.utilities.smoke_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MenuOptionsTest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        //to initialize driver
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://qa2.vytrack.com/user/login");
    }
    @Test
    public void Vehiclestitlepage(){

        VytrackUtils.login(driver,"user174","UserUser123");


        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span")).click();

        MyWaitTime.wait(5);
        String ActualResult =driver.getTitle();
        String ExpectedResult = "Car - Entities - System - Car - Entities - System";
        Assert.assertTrue(ExpectedResult.equals(ActualResult));

    }

    @Test
    public void AccountsPageTitle(){

        VytrackUtils.login(driver,"user174","UserUser123");


        MyWaitTime.wait(2);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a")).click();

        MyWaitTime.wait(5);
        String ActualResult =driver.getTitle();
        String ExpectedResult = "Accounts - Customers";
        Assert.assertTrue(ExpectedResult.equals(ActualResult));


    }

    @Test
    public void ContactsPageTitle(){
        VytrackUtils.login(driver,"user174","UserUser123");


        MyWaitTime.wait(2);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[4]/a")).click();

        MyWaitTime.wait(5);
        String ActualResult =driver.getTitle();
        String ExpectedResult = "Contacts - Customers";
        Assert.assertTrue(ExpectedResult.equals(ActualResult));

    }

    @Test
    public void CalendarEventsPageTitle(){
        VytrackUtils.login(driver,"user174","UserUser123");


        MyWaitTime.wait(2);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a")).click();

        MyWaitTime.wait(5);
        String ActualResult =driver.getTitle();
        String ExpectedResult = "Calendar Events - Activities";
        Assert.assertTrue(ExpectedResult.equals(ActualResult));

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
