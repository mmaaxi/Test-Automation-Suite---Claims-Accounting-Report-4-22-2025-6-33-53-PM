Feature: Validate insertion of the 'Monto acumulado Folio Reserva 5401' column

  Scenario: Verify the presence and correctness of the 'Monto acumulado Folio Reserva 5401' column
    Given I have exported the Excel sheet from the application
    When I inspect the Excel for the column next to 'Monto (reserva)'
    Then I should see the column 'Monto acumulado Folio Reserva 5401' in the correct position
    And I verify the formula sums the previous and current reservation amounts correctly