package Brite_ERP;

import com.vytrack.utilities.smoke_test.MyWaitTime;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CRMmodule {
    public static WebDriver driver;
    @BeforeMethod
    public static void setup() {

        String UserNameLocator = "login";    //used id to locate user name element
         String passworsLocator = "password"; //used id to locate password element

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ismail Eroglu\\Dependencies\\Drivers\\chromedriver.exe");

        //instanciate the driver variable
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://34.220.250.213/web/login");

        WebElement usernameElement = driver.findElement(By.id(UserNameLocator));
        usernameElement.sendKeys("eventscrmmanager58@info.com", Keys.ENTER);
        WebElement passwordElement = driver.findElement(By.id(passworsLocator));
        passwordElement.sendKeys("eventscrmmanager",Keys.ENTER);

    }

    @Test
    public void crmModule() {
        //find the location of the crm. need to add some waiting time.
        MyWaitTime.wait(4);
        String crmLocator = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[5]/a/span";
        driver.findElement(By.xpath(crmLocator)).click();

        //list view locator
        MyWaitTime.wait(4);
        String listViewLocator = "/html/body/div[1]/div[2]/div[1]/div[3]/div[3]/button[2]";
        driver.findElement(By.xpath(listViewLocator)).click();

        //create a few pipeline
        MyWaitTime.wait(4);
        for(int i = 1; i<3; i++){
            String createButtonLocator = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]";
            driver.findElement(By.xpath(createButtonLocator)).click();
            //fill out the opportunity form
            MyWaitTime.wait(4);
           String OpportunityLocator="o_field_input_1173";
           driver.findElement(By.id(OpportunityLocator)).sendKeys("ieroglu");

           //Expected Revenue
            MyWaitTime.wait(4);
            driver.findElement(By.id("o_field_input_1174")).click();
            driver.findElement(By.id("o_field_input_1174")).clear();
            driver.findElement(By.id("o_field_input_1174")).sendKeys("24000");

            //at Probability
            MyWaitTime.wait(4);
            driver.findElement(By.id("o_field_input_1176")).click();
            driver.findElement(By.id("o_field_input_1176")).clear();
            driver.findElement(By.id("o_field_input_1176")).sendKeys("12");

            //Customer
            MyWaitTime.wait(4);
            driver.findElement(By.id("o_field_input_1177")).click();
            driver.findElement(By.linkText("111 Hello Street")).click();

            //email
            MyWaitTime.wait(4);
            driver.findElement(By.id("o_field_input_1178")).click();
            driver.findElement(By.id("o_field_input_1178")).sendKeys("ieroglu@gmail");

            //phone
            MyWaitTime.wait(4);
            driver.findElement(By.id("o_field_input_1179")).click();
            driver.findElement(By.id("o_field_input_1179")).sendKeys("876565435");

            //sales person
            MyWaitTime.wait(4);
            driver.findElement(By.id("o_field_input_1181")).click();
            driver.findElement(By.linkText("EventsCRMManager10")).click();

            //
            MyWaitTime.wait(4);
            driver.findElement(By.id("o_field_input_1182")).click();
            driver.findElement(By.linkText("Europe")).click();

            //expected closing date
            MyWaitTime.wait(4);
            driver.findElement(By.id("o_field_input_1180")).click();
            driver.findElement(By.id("o_field_input_1180")).sendKeys("07/15/2018");

            //lets save it
            MyWaitTime.wait(4);
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")).click();






        }
    }
}
