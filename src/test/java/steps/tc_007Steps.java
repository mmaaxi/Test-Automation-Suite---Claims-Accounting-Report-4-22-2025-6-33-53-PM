package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("El Excel está abierto en la posición inicial")
    public void elExcelEstaAbiertoEnLaPosicionInicial() {
        page.openExcelFile();
    }

    @When("Localizo las columnas 'IVA 0%', 'IVA exento' e 'IVA retenido'")
    public void localizoLasColumnasIVA() {
        page.locateIVAColumns();
    }

    @Then("Cada columna aparece en la posición definida según la documentación")
    public void cadaColumnaApareceEnLaPosicionDefinida() {
        Assert.assertTrue(page.verifyColumnPositions());
    }

    @When("Verifico los nombres de las columnas y los montos")
    public void verificoLosNombresDeLasColumnasYLosMontos() {
        page.verifyColumnNamesAndValues();
    }

    @Then("Las columnas tienen los encabezados correctos y los montos son consistentes")
    public void lasColumnasTienenLosEncabezadosCorrectosYLosMontosSonConsistentes() {
        Assert.assertTrue(page.verifyColumnHeadersAndValues());
    }
}