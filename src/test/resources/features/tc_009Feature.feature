Feature: Validar adición de columnas sin valores en fase actual

  Scenario: Validar la adición de nuevas columnas y la reubicación de una columna existente
    Given El usuario está en la página de la fase actual
    When Verifica que las columnas 'Folio Pre solicitud', 'Folio de Pago', 'Status Pago Código' y 'Descripción Status Pago' están presentes
    Then Las columnas deben mostrar valores vacíos y estar en las posiciones especificadas
    And La columna 'Descripción Status Pago' debe reemplazar a 'Status de Pago' de acuerdo con la documentación de la HU 3676803