package paginas;

import org.openqa.selenium.WebDriver;

public class ResultTypes extends PageBase {
    public ResultTypes(WebDriver navegador) {
        super(navegador);
    }

    public ResultTypes newResult() throws InterruptedException {
        openLateralMenu("//a[@ng-click='resultados()']");
        clickButton("//button[@ng-click='loadModal()']");
        return this;
    }

    public ResultTypes saveResultCreat() {
        findByXPathClick("//a[@ng-click='cadastrarResultado(formEdit.name, formEdit.productive, formEdit.segment, formEdit.activeForwarding, formEdit.sendForm)']");
        toastValidation("Resultado cadastrado com sucesso");
        return this;
    }
    public ResultTypes saveResultEdit() {
        findByXPathClick("//a[@ng-click='salvarResultado(formEdit.name, formEdit.productive, formEdit.segment, formEdit.activeForwarding, formEdit.sendForm)']");
        toastValidation("Edição realizada com sucesso");
        return this;
    }

    public void openTypeFilter() throws InterruptedException {
        openLateralMenu("//a[@ng-click='resultados()']");
        type("//input[@id='filtroNome']","01 - SWD");
        clickButton("//button[@ng-click='filterResults(1)']");
    }

    public ResultTypes editResult() throws InterruptedException {
        openTypeFilter();
        clickButton("//a[@data-target='.modal-resultados']");
        return this;
    }

    public ResultTypes deleteResult() throws InterruptedException {
        openTypeFilter();
        clickButton("//a[@title='Excluir']");
        clickButton("//button[@style='float: left;']");
        toastValidation("Registro excluído com sucesso");
        return this;
    }

    public ResultTypes writeEverything() {
        type("//input[@id='name']","01 - SWD");
        selects("//select[@ng-model='formEdit.segment']","Médico");
        return this;
    }




}
