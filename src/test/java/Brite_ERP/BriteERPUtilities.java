package Brite_ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BriteERPUtilities {
    public static  WebDriver driver;                    //declare the webdriver
    private static  String UserNameLocator = "login";    //used id to locate user name element
    private static   String passworsLocator = "password"; //used id to locate password element

    @BeforeMethod
    public static void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ismail Eroglu\\Dependencies\\Drivers\\chromedriver.exe");

        //instanciate the driver variable
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://34.220.250.213/web/login");

        WebElement usernameElement = driver.findElement(By.id(UserNameLocator));
        usernameElement.sendKeys("eventscrmmanager58@info.com", Keys.ENTER);
        WebElement passwordElement = driver.findElement(By.id(passworsLocator));
        passwordElement.sendKeys("eventscrmmanager",Keys.ENTER);

    }
}
