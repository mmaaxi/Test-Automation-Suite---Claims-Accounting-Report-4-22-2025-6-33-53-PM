package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.tc_008Page;
import static org.junit.Assert.*;

public class tc_008Steps {
    WebDriver driver;
    tc_008Page pagoPage = new tc_008Page(driver);

    @Given("Estoy en la página de movimientos de pago")
    public void estoy_en_la_pagina_de_movimientos_de_pago() {
        driver = pagoPage.inicializarDriver();
        pagoPage.navegarAPaginaDeMovimientos();
    }

    @When("Reviso la celda en la columna 'Monto Acumulado Folio OPC \\(2121\\)'")
    public void reviso_la_celda_monto_acumulado_folio_opc() {
        pagoPage.revisarCeldaMontoAcumulado();
    }

    @Then("La fórmula aplicada es {string}")
    public void la_formula_aplicada_es(String expectedFormula) {
        String actualFormula = pagoPage.obtenerFormulaAplicada();
        assertEquals(expectedFormula, actualFormula);
    }

    @And("Los montos de descuento, IVA descuento, ISR, Impuesto cedular, IVA acumulable e IVA retenido están incluidos en la suma")
    public void verificar_componentes_en_la_suma() {
        assertTrue(pagoPage.verificarComponentesEnLaSuma());
    }

    @And("La suma se realiza de forma correcta y coherente con la operación de exportación")
    public void verificar_coherencia_en_la_suma() {
        assertTrue(pagoPage.verificarCoherenciaEnLaSuma());
    }
}