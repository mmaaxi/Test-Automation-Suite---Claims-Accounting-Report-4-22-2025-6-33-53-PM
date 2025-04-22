package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {

    tc_001Page claimsAccountingReportPage = new tc_001Page();

    @Given("user navigates to Canned Reports Module > Claim")
    public void navigateToCannedReportsModule() {
        claimsAccountingReportPage.goToCannedReports();
    }

    @When("user selects 'Claim Accounting Report' and executes Submit")
    public void selectClaimAccountingAndSubmit() {
        claimsAccountingReportPage.selectClaimAccountingReport();
        claimsAccountingReportPage.submitReport();
    }

    @Then("report should load with view and log options")
    public void verifyReportLoaded() {
        Assert.assertTrue(claimsAccountingReportPage.isReportLoaded());
    }

    @When("user accesses 'View Log', adds Folio and downloads Excel file")
    public void accessViewLogAndDownloadExcel() {
        claimsAccountingReportPage.viewLog();
        claimsAccountingReportPage.addFolio();
        claimsAccountingReportPage.downloadExcelFile();
    }

    @Then("an Excel file with modifications should be generated")
    public void verifyExcelFileGenerated() {
        Assert.assertTrue(claimsAccountingReportPage.isExcelFileGenerated());
    }
}