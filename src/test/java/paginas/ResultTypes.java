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
        clickButton("//a[@ng-click='cadastrarResultado(formEdit.name, formEdit.productive, formEdit.segment, formEdit.activeForwarding, formEdit.sendForm)']");
        toastValidation("Resultado cadastrado com sucesso");
        return this;
    }
    public ResultTypes saveResultEdit() {
        clickButton("//a[@ng-click='salvarResultado(formEdit.name, formEdit.productive, formEdit.segment, formEdit.activeForwarding, formEdit.sendForm)']");
        toastValidation("Edição realizada com sucesso");
        return this;
    }

    public ResultTypes editResult() throws InterruptedException {
        openTypeFilter("//a[@ng-click='resultados()']", "//input[@id='filtroNome']", "//button[@ng-click='filterResults(1)']");
        clickButton("//a[@data-target='.modal-resultados']");
        return this;
    }

    public ResultTypes deleteResult() throws InterruptedException {
        openTypeFilter("//a[@ng-click='resultados()']", "//input[@id='filtroNome']", "//button[@ng-click='filterResults(1)']");
        clickButton("//a[@title='Excluir']");
        clickButton("//button[@style='float: left;']");
        toastValidation("Registro excluído com sucesso");
        return this;
    }

    public ResultTypes writeEverything() {
        type("//input[@id='name']",swd);
        selects("//select[@ng-model='formEdit.segment']","Médico");
        return this;
    }




}
