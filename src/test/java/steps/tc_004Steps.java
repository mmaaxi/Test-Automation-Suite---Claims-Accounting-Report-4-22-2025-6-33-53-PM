package steps;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_004Page;

public class tc_004Steps {
    tc_004Page page = new tc_004Page();

    @Given("I have exported the Excel document")
    public void i_have_exported_excel_document() {
        page.exportExcel();
    }

    @When("I compare the values in the 'estado' column with the documentation")
    public void i_compare_values_estado_column_with_documentation() {
        boolean isComparisonSuccessful = page.compareEstadoColumn();
        Assert.assertTrue("The estado column does not match the documentation", isComparisonSuccessful);
    }

    @Then("the values and formulas in the 'estado' column should be updated correctly")
    public void values_formulas_estado_column_should_be_updated_correctly() {
        Assert.assertTrue("The estado column values and formulas are not updated correctly", page.isEstadoUpdatedCorrectly());
    }

    @Given("I have a list of records to check")
    public void i_have_list_of_records_to_check() {
        page.retrieveRecords();
    }

    @When("I verify each record for 'estado' updates")
    public void i_verify_each_record_for_estado_updates() {
        boolean areAllRecordsUpdated = page.verifyEstadoUpdates();
        Assert.assertTrue("Not all records are updated as expected", areAllRecordsUpdated);
    }

    @Then("all records should reflect the updates as expected")
    public void all_records_should_reflect_updates_as_expected() {
        Assert.assertTrue("Not all records reflect updates as expected", page.doAllRecordsReflectUpdates());
    }
}