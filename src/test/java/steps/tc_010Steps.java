package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page IVAColumnaPage = new tc_010Page();

    @Given("que el usuario revisa la fórmula de la columna 'IVA Acumulado' en el Excel")
    public void revisar_formula_columna_IVA_Acumulado() {
        IVAColumnaPage.abrirExcel();
        IVAColumnaPage.revisarFormulaIVA();
    }

    @Then("la fórmula incluye IVA 16%, IVA fronterizo, IVA 0% e IVA exento y excluye IVA retenido")
    public void verificar_formula_incluye_excluye_IVA() {
        IVAColumnaPage.verificarComponentesFormula();
    }

    @Given("el usuario verifica que la suma de montos refleje correctamente los valores aplicables")
    public void verificar_suma_montos() {
        IVAColumnaPage.verificarSumaMontos();
    }

    @Then("el resultado de la fórmula es preciso y se ajusta a los nuevos requerimientos")
    public void verificacion_resultado_formula() {
        IVAColumnaPage.verificarResultadoFormula();
    }
}