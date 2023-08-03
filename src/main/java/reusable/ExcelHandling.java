package reusable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelHandling {

    public static String readexcel(String sheetName, int row, int coloumn) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("src/main/resources/datasheet/TestDataCredentials.xlsx"));
        XSSFWorkbook worbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = worbook.getSheet(sheetName);
       return sheet.getRow(row).getCell(coloumn).getStringCellValue();

    }



}
