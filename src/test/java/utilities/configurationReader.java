package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class configurationReader {

    private static Properties configFile;

    static {
        try{
            String path = "/configuration.properties";
            FileInputStream input = new FileInputStream(path);
            configFile = new Properties();

            configFile.load(input);
            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static String getProperty(String key){
        return configFile.getProperty(key);
    }
}
