package Udemy;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {

   public WebDriver driver;

    public WebDriver initializeDriver() throws IOException {
        Properties preperty = new Properties();
        FileInputStream file = new FileInputStream("C:\\Users\\Ismail Eroglu\\vytrackautomation\\src\\test\\java\\Udemy\\data.properties");

        preperty.load(file);
       String browserName =  preperty.getProperty("browser");

       if(  browserName.equals("chrome")  ){

           System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ismail Eroglu\\Dependencies\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();

       }else if(        browserName.equals("firefox")         ){
           System.setProperty("webdriver.firefox.driver", "C:\\Users\\Ismail Eroglu\\Dependencies\\Drivers\\geckodriver.exe");

           driver = new FirefoxDriver();

       }else if(      browserName.equals("IE")          ){

          driver = new InternetExplorerDriver();

       }

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();

       return driver;
    }

    public void getScreenShot() throws  IOException{
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("c://users//ismail Eroglu//screenshot.png"));
    }



}
