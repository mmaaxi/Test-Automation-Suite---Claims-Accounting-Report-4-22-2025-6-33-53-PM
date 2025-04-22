package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("I have exported the Excel sheet from the application")
    public void exportExcel() {
        page.exportExcel();
    }

    @When("I inspect the Excel for the column next to 'Monto (reserva)'")
    public void inspectExcelForColumn() {
        page.locateColumn();
    }

    @Then("I should see the column 'Monto acumulado Folio Reserva 5401' in the correct position")
    public void verifyColumnPresence() {
        Assert.assertTrue("The column is not in the correct position", page.isColumnInCorrectPosition());
    }

    @And("I verify the formula sums the previous and current reservation amounts correctly")
    public void verifyFormula() {
        Assert.assertTrue("The formula is not calculating correctly", page.isFormulaCorrect());
    }
}