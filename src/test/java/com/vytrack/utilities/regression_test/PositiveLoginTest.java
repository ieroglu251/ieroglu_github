package com.vytrack.utilities.regression_test;

import com.vytrack.utilities.smoke_test.MyWaitTime;
import com.vytrack.utilities.smoke_test.VytrackUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
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

        MyWaitTime.wait(5);
        String ActualResult = driver.findElement(By.cssSelector(storeManagerNameDisplayLocation)).getText();
        String ExpectedResult = "Darrick Bergstrom";
        Assert.assertTrue(ExpectedResult.equals(ActualResult));

    }
}
