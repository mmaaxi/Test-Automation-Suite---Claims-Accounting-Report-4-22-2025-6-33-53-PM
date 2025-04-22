Feature: Validar fórmula en 'Monto Acumulado Folio OPC (2121)' para movimientos de pago

  Scenario: Verificar fórmula aplicada y componentes en la celda 'Monto Acumulado Folio OPC (2121)'
    Given Estoy en la página de movimientos de pago
    When Reviso la celda en la columna 'Monto Acumulado Folio OPC (2121)'
    Then La fórmula aplicada es "=Z4+AD5+AE5+AH5+AC5+AB5+AM5"
    And Los montos de descuento, IVA descuento, ISR, Impuesto cedular, IVA acumulable e IVA retenido están incluidos en la suma
    And La suma se realiza de forma correcta y coherente con la operación de exportación