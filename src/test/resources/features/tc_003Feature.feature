Feature: Validar inclusión de la columna 'Estado Código'
  Scenario: Validar que la columna 'Estado Código' esté presente con el nombre correcto
    Given un Excel exportado con las columnas actuales
    When reviso la estructura de columnas del Excel
    Then la columna 'Estado Código' se encuentra a la derecha de la columna 'i'
    And el encabezado exacto es 'Estado Código'