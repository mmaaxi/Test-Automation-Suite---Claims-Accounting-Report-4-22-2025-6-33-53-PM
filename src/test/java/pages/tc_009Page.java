package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_009Page {
    WebDriver driver;

    By folioPresolicitudColumn = By.id("folioPreSolicitud");
    By folioPagoColumn = By.id("folioPago");
    By statusPagoCodigoColumn = By.id("statusPagoCodigo");
    By descripcionStatusPagoColumn = By.id("descripcionStatusPago");
    By statusDePagoColumn = By.id("statusDePago");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToPhasePage() {
        driver.get("http://yourapplicationurl.com/phase"); 
    }

    public boolean areColumnsPresent() {
        return driver.findElement(folioPresolicitudColumn).isDisplayed() &&
               driver.findElement(folioPagoColumn).isDisplayed() &&
               driver.findElement(statusPagoCodigoColumn).isDisplayed() &&
               driver.findElement(descripcionStatusPagoColumn).isDisplayed();
    }

    public boolean areColumnsEmptyAndInCorrectPosition() {
        return driver.findElement(folioPresolicitudColumn).getText().isEmpty() &&
               driver.findElement(folioPagoColumn).getText().isEmpty() &&
               driver.findElement(statusPagoCodigoColumn).getText().isEmpty() &&
               driver.findElement(descripcionStatusPagoColumn).getText().isEmpty();
    }

    public boolean isDescriptionStatusPagoReplacingStatusDePago() {
        // Check if 'Descripción Status Pago' is in place of 'Status de Pago'
        return !driver.findElement(statusDePagoColumn).isDisplayed() &&
               driver.findElement(descripcionStatusPagoColumn).isDisplayed();
    }
}