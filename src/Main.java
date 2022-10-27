import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, IOException {
        String path="/Users/mayrasegoviademejia/IdeaProjects/Apachi/test.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);
        XSSFWorkbook xssfWorkbook= new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("sheet1");
        Row row =sheet.getRow(0);
        System.out.println(row.getCell(0));

    }



}
