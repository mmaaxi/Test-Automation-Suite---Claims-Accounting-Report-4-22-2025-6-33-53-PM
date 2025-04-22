package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_003Page;

import java.util.List;

public class tc_003Steps {

    tc_003Page excelPage = new tc_003Page();
    List<String> columnHeaders;

    @Given("un Excel exportado con las columnas actuales")
    public void exportExistingExcel() {
        excelPage.loadExcel();
    }

    @When("reviso la estructura de columnas del Excel")
    public void reviewExcelStructure() {
        columnHeaders = excelPage.getColumnHeaders();
    }

    @Then("la columna 'Estado Código' se encuentra a la derecha de la columna 'i'")
    public void validateEstadoCodigoColumnPosition() {
        int indexI = columnHeaders.indexOf("i");
        int indexEstadoCodigo = columnHeaders.indexOf("Estado Código");
        Assert.assertTrue(indexEstadoCodigo == indexI + 1);
    }

    @Then("el encabezado exacto es 'Estado Código'")
    public void validateEstadoCodigoHeader() {
        Assert.assertTrue(columnHeaders.contains("Estado Código"));
    }
}