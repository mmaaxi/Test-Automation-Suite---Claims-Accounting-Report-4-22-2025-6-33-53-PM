package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;

import static org.junit.Assert.assertEquals;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page page;

    public tc_002Steps() {
        this.driver = Hooks.getDriver();
        page = new tc_002Page(driver);
    }

    @Given("the exported Excel file is opened")
    public void theExportedExcelFileIsOpened() {
        page.openExcelFile();
    }

    @When("I select cell C2")
    public void iSelectCellC2() {
        page.selectCellC2();
    }

    @Then("the cell C2 should contain the concatenation of 'No. Siniestro', 'No. de autorización', 'status', 'tipo de mov', and 'no. de movimiento'")
    public void theCellC2ShouldContainConcatenation() {
        String expectedContent = "concatenated_value"; // replace with the expected concatenated value
        String actualContent = page.getCellContentC2();
        assertEquals(expectedContent, actualContent);
    }

    @Then("the formula =CONCATENATE(D2, '_', H2, '_', U2, '_', O2, '_', E2) should be applied correctly")
    public void theFormulaShouldBeAppliedCorrectly() {
        String expectedFormula = "D2 & \"_\" & H2 & \"_\" & U2 & \"_\" & O2 & \"_\" & E2";
        String actualFormula = page.getCellFormulaC2();
        assertEquals(expectedFormula, actualFormula);
    }

    @Then("the result should have the expected format")
    public void theResultShouldHaveExpectedFormat() {
        String format = page.getResultFormat(); 
        assertEquals("Expected_Format", format); // replace with the expected format
    }
}