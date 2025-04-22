Feature: Ajuste en la fórmula de la columna 'IVA Acumulado'

  Scenario: Validar ajuste en la fórmula de la columna 'IVA Acumulado'
    Given que el usuario revisa la fórmula de la columna 'IVA Acumulado' en el Excel
    Then la fórmula incluye IVA 16%, IVA fronterizo, IVA 0% e IVA exento y excluye IVA retenido
    And el usuario verifica que la suma de montos refleje correctamente los valores aplicables
    Then el resultado de la fórmula es preciso y se ajusta a los nuevos requerimientos