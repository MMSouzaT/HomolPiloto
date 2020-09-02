package paginas;

import org.openqa.selenium.WebDriver;

public class CareTypes extends PageBase {
    public CareTypes(WebDriver navegador) {
        super(navegador);
    }

    public CareTypes newCareType() throws InterruptedException {
        openLateralMenu("//a[@ng-click='tipoAtendimentos()']");
        clickButton("//button[@data-target='.modal-tipo-atendimento']");
        return this;
    }

    public CareTypes saveCareTypeCreate() {
        clickButton("//a[@ng-click='cadastrarTipoAtendimento(formEdit.name, formEdit.segment)']");
        toastValidation("Tipo de atendimento cadastrado com sucesso.");
        return this;
    }

    public CareTypes saveCareTypeEdit() {
        clickButton("//a[@ng-click='salvarTipoAtendimento(formEdit.name, formEdit.segment)']");
        toastValidation("Edição realizada com sucesso");
        return this;
    }

    public CareTypes editCareType() throws InterruptedException {
        openTypeFilter();
        clickButton("//a[@data-target='.modal-tipo-atendimento']");
        return this;
    }
    public CareTypes deleteCareType() throws InterruptedException {
        openTypeFilter();
        clickButton("//a[@ng-click='deletarTipoAtendimento(item.id)']");
        clickButton("//button[@style='float: left;']");
        toastValidation("Registro excluído com sucesso");
        return this;
    }
    public void openTypeFilter() throws InterruptedException {
        openLateralMenu("//a[@ng-click='tipoAtendimentos()']");
        type("//input[@id='nameFilter']","01 - SWD");
        clickButton("//button[@ng-click='filterTypeTreatments(1)']");
    }


    public CareTypes writeEverything() {
        type("//input[@ng-model='formEdit.name']", "01 - SWD");
        selects("//select[@ng-model='formEdit.segment']", "Médico");
        return this;
    }
}
