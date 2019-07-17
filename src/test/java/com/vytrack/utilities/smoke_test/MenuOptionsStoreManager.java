package com.vytrack.utilities.smoke_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MenuOptionsStoreManager {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        //to initialize driver
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://qa2.vytrack.com/user/login");
    }

    @Test
    public void DashboardPageTitle(){
        VytrackUtils.login(driver,"storemanager207","UserUser123");

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a")).click();
        MyWaitTime.wait(2);
        System.out.println( driver.getTitle());


    }
    @Test
    public void VehiclesPageTitle(){

        VytrackUtils.login(driver,"storemanager207","UserUser123");

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span")).click();
        MyWaitTime.wait(2);
        System.out.println( driver.getTitle());

    }

    @Test
    public void 	CustomersAccountsPageTitle(){

        VytrackUtils.login(driver,"storemanager207","UserUser123");

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a")).click();
        MyWaitTime.wait(2);
        System.out.println( driver.getTitle());

    }

    @Test
    public void CustomersContactsPageTitle(){

        VytrackUtils.login(driver,"storemanager207","UserUser123");

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[4]/a")).click();
        MyWaitTime.wait(2);
        System.out.println( driver.getTitle());

    }

    @Test
    public void SalesOpportunitiesTageTitle(){

        VytrackUtils.login(driver,"storemanager207","UserUser123");

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[4]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[4]/div/div/ul/li[3]/a")).click();
        MyWaitTime.wait(2);
        System.out.println( driver.getTitle());

    }

    @Test
    public void ActivitiesCallsPageTitle(){

        VytrackUtils.login(driver,"storemanager207","UserUser123");

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/div/div/ul/li[3]/a")).click();
        MyWaitTime.wait(2);
        System.out.println( driver.getTitle());

    }
    @Test
    public void 	ActivitiesCalendarEventsPageTitle(){

        VytrackUtils.login(driver,"storemanager207","UserUser123");

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/div/div/ul/li[4]/a")).click();
        MyWaitTime.wait(2);
        System.out.println( driver.getTitle());

    }
}
