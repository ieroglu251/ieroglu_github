package Cybertek_Class_Notes;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.Properties;

public class SystemPropertyTest {

    @Test
    public void systemPropertiesTest1(){
       String os = System.getProperty("os.name");
        System.out.println(  os );  //returns operating system. to configure appropriate webdriver.
        String username = System.getProperty("user.name");
        String javaVersion = System.getProperty("java.specification.version");
        String homeDirektory = System.getProperty("user.home");
        System.out.println(  username );
        System.out.println(  javaVersion );
        System.out.println(  homeDirektory );

      Properties properties = System.getProperties();
       for(Map.Entry<Object, Object> property: properties.entrySet()){
           System.out.println(  "key: " + property.getKey()+ ", value: " + property.getValue());



        }



    }
    @Test
    public void test1(){
        String expected = "chrome";
        String actual = utilities.configurationReader.getProperty("chrome");

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void test2(){
        String expectedUsername = "storemaneger85";
        String actualusername = utilities.configurationReader.getProperty("username");

        Assert.assertEquals(actualusername,expectedUsername);
    }
}
