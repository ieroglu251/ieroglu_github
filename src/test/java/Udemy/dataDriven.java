package Udemy;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class dataDriven {

    public ArrayList<String> getData(String testcaseName) throws IOException {
        ArrayList<String> a = new ArrayList<String>();

        FileInputStream fis = new FileInputStream("C:\\Users\\Ismail Eroglu\\Others\\Desktop\\seleniumTest.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        int sheets = workbook.getNumberOfSheets();

        return a;
    }

}
