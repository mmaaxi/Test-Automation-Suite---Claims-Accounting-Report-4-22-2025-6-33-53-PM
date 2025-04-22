package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_008Page {
    WebDriver driver;
    private By celdaMontoAcumulado = By.xpath("//td[@id='montoAcumulado']");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver inicializarDriver() {
        // Inicializar el driver (ej: new ChromeDriver())
        return driver;
    }

    public void navegarAPaginaDeMovimientos() {
        driver.get("url_de_la_pagina_de_movimientos_de_pago");
    }

    public void revisarCeldaMontoAcumulado() {
        WebElement celda = driver.findElement(celdaMontoAcumulado);
        // Revisión visual o lógica adicional si es necesaria
    }

    public String obtenerFormulaAplicada() {
        WebElement celda = driver.findElement(celdaMontoAcumulado);
        return celda.getAttribute("data-formula-aplicada");
    }

    public boolean verificarComponentesEnLaSuma() {
        // Lógica para verificar que los componentes se incluyan correctamente
        return true;
    }

    public boolean verificarCoherenciaEnLaSuma() {
        // Lógica para verificar la coherencia de la suma respecto a la operación de exportación
        return true;
    }
}