package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {

    WebDriver driver;

    By cannedReportsModule = By.id("cannedReportsModule");
    By claimAccountingReportOption = By.id("claimAccountingReport");
    By submitButton = By.id("submitBtn");
    By viewLogButton = By.id("viewLogBtn");
    By folioInput = By.id("folioInput");
    By downloadExcelButton = By.id("downloadExcelBtn");
    
    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void goToCannedReports() {
        driver.findElement(cannedReportsModule).click();
    }

    public void selectClaimAccountingReport() {
        driver.findElement(claimAccountingReportOption).click();
    }

    public void submitReport() {
        driver.findElement(submitButton).click();
    }

    public boolean isReportLoaded() {
        // Logic to verify report loaded
        return true;
    }

    public void viewLog() {
        driver.findElement(viewLogButton).click();
    }

    public void addFolio() {
        driver.findElement(folioInput).sendKeys("SampleFolio");
    }

    public void downloadExcelFile() {
        driver.findElement(downloadExcelButton).click();
    }

    public boolean isExcelFileGenerated() {
        // Logic to verify if Excel file is generated
        return true;
    }
}