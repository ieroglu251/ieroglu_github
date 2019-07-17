package com.vytrack.utilities.smoke_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class VytrackUtils {
    private static String usernameLocator = "prependedInput";
    private static String passwordLocator = "prependedInput2";

    public static void login(WebDriver driver, String username, String password){

        driver.findElement(By.id(usernameLocator)).sendKeys(username);
        driver.findElement(By.id(passwordLocator)).sendKeys(password, Keys.ENTER);
        MyWaitTime.wait(3);
    }

    public static void navigateToModule(WebDriver driver, String tab, String module){
        String tabLocator = "//span[contains(text(),'"+tab+"') and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[contains(text(),'"+module+"') and contains(@class, 'title title-level-2')]";

    }

}
