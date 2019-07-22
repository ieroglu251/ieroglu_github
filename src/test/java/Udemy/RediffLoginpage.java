package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffLoginpage {

    WebDriver driver;

    public RediffLoginpage(WebDriver driver){
        this.driver = driver;
    }

//    By username = By.xpath("//*[@id=\"login1\"]");
//    By password = By.name("passwd");
//    By go = By.name("proceed"); ;

    @FindBy(xpath = "//*[@id=\"login1\"]")
    WebElement username;

    @FindBy(name = "passwd")
    WebElement password;

    @FindBy(name = "proceed")
    WebElement go;

    public WebElement Email(){
        return username;
    }

    public WebElement Password(){
        return password;
    }

    public WebElement Submit(){
        return go;
    }
}
