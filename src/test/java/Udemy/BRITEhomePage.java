package Udemy;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class BRITEhomePage extends base {

    @Test(dataProvider =  "getData")
    public void basePageNavigation(String username, String password) throws IOException {

       driver =  initializeDriver();
       driver.get("http://34.220.250.213/");

       BRITELoginPage signin = new BRITELoginPage(driver);
       signin.getLogin().click();
       signin.userName().sendKeys(username, Keys.ENTER);
       signin.password().sendKeys(password, Keys.ENTER);

    }
    @DataProvider
    public Object[][] getData(){
        Object [][]data = new Object[1][2];

        data[0][0] = "eventscrmmanager58@info.com";
        data[0][1] = "eventscrmmanager";

        return data;
    }
}
