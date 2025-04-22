Feature: Validate 'estado' field update

  Scenario: Compare exported Excel rows with 'Descripción de Campos' documentation
    Given I have exported the Excel document
    When I compare the values in the 'estado' column with the documentation
    Then the values and formulas in the 'estado' column should be updated correctly

  Scenario: Confirm updates reflect in all affected records
    Given I have a list of records to check
    When I verify each record for 'estado' updates
    Then all records should reflect the updates as expected