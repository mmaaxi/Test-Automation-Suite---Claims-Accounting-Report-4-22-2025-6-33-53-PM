package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {

    private WebDriver driver;
    private String excelFilePath = "path/to/excel/file.xlsx";
    private By columnZHeaderSelector = By.xpath("//table//th[preceding-sibling::th[25]]");
    private String oldHeader = "Old Header Name";

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openExcelFile() {
        // Code to open the Excel file
        // This operation is generally handled by interacting with Excel APIs
    }

    public void navigateToColumnZ() {
        // Logic to navigate to column Z in the Excel representation
    }

    public String getColumnZHeaderText() {
        WebElement header = driver.findElement(columnZHeaderSelector);
        return header.getText();
    }

    public boolean hasOldHeader() {
        // Logic to check if any cell in column Z contains the old header
        return driver.findElements(By.xpath("//table//th[text()='" + oldHeader + "']")).size() > 0;
    }
}