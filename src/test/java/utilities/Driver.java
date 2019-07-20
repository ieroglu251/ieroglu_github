package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            if( utilities.configurationReader.getProperty("browser").equals("chrome")){
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            else if(utilities.configurationReader.getProperty("browser").equals("firefox")){
                WebDriverManager.chromedriver().setup();
                driver = new FirefoxDriver();
            }else{
                throw new RuntimeException("browser wrong");
            }
        }
        return driver;
    }
}
