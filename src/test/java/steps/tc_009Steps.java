package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_009Page;

public class tc_009Steps {
    WebDriver driver;
    tc_009Page page;

    @Given("El usuario está en la página de la fase actual")
    public void elUsuarioEstaEnLaPaginaDeLaFaseActual() {
        driver = hooks.Hooks.getDriver();
        page = new tc_009Page(driver);
        page.navigateToPhasePage();
    }

    @When("Verifica que las columnas 'Folio Pre solicitud', 'Folio de Pago', 'Status Pago Código' y 'Descripción Status Pago' están presentes")
    public void verificaQueLasColumnasEstánPresentes() {
        Assert.assertTrue(page.areColumnsPresent());
    }

    @Then("Las columnas deben mostrar valores vacíos y estar en las posiciones especificadas")
    public void lasColumnasDebenMostrarValoresVaciosYEstarEnLasPosicionesEspecificadas() {
        Assert.assertTrue(page.areColumnsEmptyAndInCorrectPosition());
    }

    @Then("La columna 'Descripción Status Pago' debe reemplazar a 'Status de Pago' de acuerdo con la documentación de la HU 3676803")
    public void laColumnaDescripcionStatusPagoDebeReemplazarAStatusDePago() {
        Assert.assertTrue(page.isDescriptionStatusPagoReplacingStatusDePago());
    }
}