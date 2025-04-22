package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_006Page;
import static org.junit.Assert.*;

public class tc_006Steps {

    private tc_006Page page;

    public tc_006Steps() {
        this.page = new tc_006Page();
    }

    @Given("the Excel file is opened")
    public void the_excel_file_is_opened() {
        page.openExcelFile();
    }

    @When("I navigate to column Z")
    public void i_navigate_to_column_z() {
        page.navigateToColumnZ();
    }

    @Then("the column Z header should display 'Monto Acumulado Folio OPC (2121)'")
    public void the_column_z_header_should_display_new_header() {
        assertEquals("Monto Acumulado Folio OPC (2121)", page.getColumnZHeaderText());
    }

    @Then("there should be no cells with the old header")
    public void there_should_be_no_cells_with_the_old_header() {
        assertFalse(page.hasOldHeader());
    }
}