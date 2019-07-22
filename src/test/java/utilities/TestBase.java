//package utilities;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//
//import java.util.concurrent.TimeUnit;
//
//public class TestBase {
//
//    WebDriver driver;
//    Actions action;
//
//    @BeforeMethod
//    public void setup(){
//        driver = driver.getDriver();
//        action = new Actions(driver);
//        driver.manage().timeouts().implicitlyWait(Long.valueOf(utilities.configurationReader.getProperty("implicitwait")), TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }
//
//    @AfterMethod
//    public void teardown(){
//        driver.closeDriver();
//    }
//}
