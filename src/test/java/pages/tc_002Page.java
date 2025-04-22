package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openExcelFile() {
        driver.get("file://path_to_your_excel_file"); // specify actual path
    }

    public void selectCellC2() {
        WebElement cellC2 = driver.findElement(By.id("C2"));
        cellC2.click();
    }

    public String getCellContentC2() {
        WebElement cellC2 = driver.findElement(By.id("C2"));
        return cellC2.getText();
    }
    
    public String getCellFormulaC2() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return (String) js.executeScript("return getFormulaOfCell('C2')");
    }

    public String getResultFormat() {
        // Example: Implement the logic to obtain the format of the result in C2.
        return "Actual_Format"; // implement logic to return actual format
    }
}