package Brite_ERP;

import com.vytrack.utilities.smoke_test.MyWaitTime;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class Brite_ERP_Repairs_Test {

    //username and password locators by id
    public static  WebDriver driver;                    //declare the webdriver
    private static  String UserNameLocator = "login";    //used id to locate user name element
    private static   String passworsLocator = "password"; //used id to locate password element
    String RepairsLocator = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[9]/a/span"; //xpath to locate the element
    String CreateLocator = "//button[@class ='btn btn-primary btn-sm o_list_button_add']"; //xpath used to locate the element.
    String ProductToRepairLocator = "o_field_input_65";                                    //id used to locate the item


    @BeforeMethod
    public static void setup() {

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
    public void RepairTest(){

       // BriteERPUtilities.setup();

        WebElement RepairsElemnt = driver.findElement(By.xpath(RepairsLocator));
        RepairsElemnt.click();
        MyWaitTime.wait(2);
        WebElement createbutton = driver.findElement(By.xpath(CreateLocator));
        createbutton.click();
        MyWaitTime.wait(5);
        WebElement RepairRefLocator = driver.findElement(By.xpath("//input[@class = 'o_field_char o_field_widget o_input o_required_modifier']"));
        RepairRefLocator.clear();
        RepairRefLocator.sendKeys("IE1720");
        MyWaitTime.wait(10);
      //  product to repair
        WebElement ProductToRepair = driver.findElement(By.id(ProductToRepairLocator));
        ProductToRepair.click();

        // product to repair items selected
        MyWaitTime.wait(2);
        driver.findElement(By.linkText("[13] Ice Cream")).click();
        //find product quantity and clear it
        MyWaitTime.wait(2);
        driver.findElement(By.id("o_field_input_66")).clear();
        //send new quatity
        MyWaitTime.wait(2);
        driver.findElement(By.id("o_field_input_66")).sendKeys("3");
        MyWaitTime.wait(2);
        //choose customer
        driver.findElement(By.id("o_field_input_69")).click();
        driver.findElement(By.linkText("111 Hello Street")).click();
        //and so on...
        MyWaitTime.wait(2);
        //lets save it
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")).click();





    }

//    @AfterMethod
//    public void teardown(){
//        driver.quit();
//    }
}
