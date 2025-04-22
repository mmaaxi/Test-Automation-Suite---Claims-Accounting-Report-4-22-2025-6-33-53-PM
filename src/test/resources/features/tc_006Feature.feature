Feature: Validate renaming of column 'Monto Acumulado Folio OPC'

  Scenario: Validate renaming of the 'Monto Acumulado Folio OPC' column
    Given the Excel file is opened
    When I navigate to column Z
    Then the column Z header should display 'Monto Acumulado Folio OPC (2121)'
    And there should be no cells with the old header