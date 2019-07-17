package com.vytrack.utilities.regression_test;

import com.vytrack.utilities.smoke_test.MyWaitTime;
import com.vytrack.utilities.smoke_test.VytrackUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PositiveLoginTest {

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
    public void storeManagerNameDisplayTest(){

        VytrackUtils.login(driver,"storemanager207","UserUser123");


        String storeManagerNameDisplayLocation = "\"#user-menu > a\"";
        String StoreManagerDashBoardLocator = "#main-menu > ul > li.dropdown.dropdown-level-1.first > a > span";



        MyWaitTime.wait(5);
        String ExpectedResult = "Darrick Bergstrom";
        String ActualResult = driver.findElement(By.cssSelector(storeManagerNameDisplayLocation)).getText();
        Assert.assertTrue(ExpectedResult.equals(ActualResult));

        MyWaitTime.wait(5);
        String DashBoardActualResult = driver.findElement(By.cssSelector(StoreManagerDashBoardLocator)).getText();
        String DashBoardExpectedResult = "Dashboards - Dashboard";
        Assert.assertTrue(DashBoardActualResult.equals(DashBoardExpectedResult));

        MyWaitTime.wait(2);
        String LogoutIconLocator = "#user-menu > a";
        String LogoutLocator = "#user-menu > ul > li.last";
        MyWaitTime.wait(2);
        driver.findElement(By.cssSelector(LogoutIconLocator)).click();
        driver.findElement(By.cssSelector(LogoutLocator)).click();


    }
}
