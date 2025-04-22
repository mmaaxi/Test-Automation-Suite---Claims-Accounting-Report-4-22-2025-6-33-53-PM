Feature: Validate key construction in Column C

  Scenario: Validate C2 cell contents and formula application
    Given the exported Excel file is opened
    When I select cell C2
    Then the cell C2 should contain the concatenation of 'No. Siniestro', 'No. de autorización', 'status', 'tipo de mov', and 'no. de movimiento'
    And the formula =CONCATENATE(D2, '_', H2, '_', U2, '_', O2, '_', E2) should be applied correctly
    And the result should have the expected format