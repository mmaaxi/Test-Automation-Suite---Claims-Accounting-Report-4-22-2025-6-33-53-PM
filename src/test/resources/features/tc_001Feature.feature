Feature: Validate Excel export with modifications in Claims Accounting Report

  Scenario: Export Excel with modifications in Claims Accounting Report
    Given user navigates to Canned Reports Module > Claim
    When user selects 'Claim Accounting Report' and executes Submit
    Then report should load with view and log options
    When user accesses 'View Log', adds Folio and downloads Excel file
    Then an Excel file with modifications should be generated