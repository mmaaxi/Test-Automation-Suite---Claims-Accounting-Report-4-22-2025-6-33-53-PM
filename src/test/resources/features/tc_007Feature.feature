Feature: Validación de columnas IVA en el Excel

  Scenario: Validar inclusión y nombrado correcto de las columnas IVA
    Given El Excel está abierto en la posición inicial
    When Localizo las columnas 'IVA 0%', 'IVA exento' e 'IVA retenido'
    Then Cada columna aparece en la posición definida según la documentación
    When Verifico los nombres de las columnas y los montos
    Then Las columnas tienen los encabezados correctos y los montos son consistentes