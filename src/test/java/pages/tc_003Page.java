package pages;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class tc_003Page {

    private static final String FILE_PATH = "path/to/exported/excel.xlsx";

    public void loadExcel() {
        // Logic to open and prepare the Excel file for reading.
    }

    public List<String> getColumnHeaders() {
        List<String> headers = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(FILE_PATH);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            Row headerRow = sheet.getRow(0);
            headerRow.forEach(cell -> headers.add(cell.getStringCellValue()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return headers;
    }
}