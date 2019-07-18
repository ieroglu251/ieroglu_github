package Udemy;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class dataDriven {

    public static ArrayList<String> getData(String testcaseName) throws IOException {
        ArrayList<String> a = new ArrayList<String>();

        FileInputStream fis = new FileInputStream("C:\\Users\\Ismail Eroglu\\Others\\Desktop\\seleniumTest.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        int sheets = workbook.getNumberOfSheets();
        System.out.println( "Number of sheets: "+sheets );

        for(int i = 0; i < sheets; i++){
            if(workbook.getSheetName(i).equalsIgnoreCase("dataType")   ){
                XSSFSheet sheet = workbook.getSheetAt(i);

                Iterator<Row> rows = sheet.iterator();
                Row firstrow = rows.next();

                Iterator<Cell> ce = firstrow.cellIterator();

                int k  = 0;
                int coloumn = 0;
                while(ce.hasNext()){
                    Cell value = ce.next();

                    if(value.getStringCellValue().equalsIgnoreCase("dataType")){
                        coloumn = k;

                    }
                    k++;
                }
                System.out.println( coloumn );

                while (rows.hasNext()){
                    Row r = rows.next();

                    if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName)   ){
                        Iterator<Cell> cv = r.cellIterator();
                        while(cv.hasNext()){
                            Cell c= cv.next();
                            if(c.getCellTypeEnum()== CellType.STRING){
                                a.add(c.getStringCellValue() );
                            }else{
                                a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
                            }

                        }
                    }
                }
            }

        }

        return a;
    }

    public static void main(String[] args) {

        try{
            getData("dataType");
        }catch (Exception e){
            System.out.println("something wrong");
        }

    }

}
