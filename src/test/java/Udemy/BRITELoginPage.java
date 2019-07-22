package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BRITELoginPage {

    WebDriver driver;

    public BRITELoginPage(WebDriver driver){
        this.driver = driver;
    }

    By signin = By.xpath("//*[@id=\"top_menu\"]/li[10]/a/b");

//    @FindBy(xpath = "//*[@id=\"top_menu\"]/li[10]/a/b")
//    WebElement  signin;

    public WebElement getLogin(){
        return  driver.findElement(signin); //signin; //
    }

    By userName = By.id("login");
    public WebElement userName(){
        return driver.findElement(userName);
    }
    By password = By.id("password");
    public WebElement password(){
        return driver.findElement(password);
    }
}
