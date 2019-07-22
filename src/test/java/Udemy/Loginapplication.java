package Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginapplication {

    @Test
    public void Login(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ismail Eroglu\\Dependencies\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        RediffLoginpage rd = new RediffLoginpage(driver);

        rd.Email().sendKeys("Hello");
        rd.Password().sendKeys("123456");
        rd.Submit().click();


    }
}
