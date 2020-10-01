package paginas;

import org.openqa.selenium.WebDriver;

public class AccessValidationn extends PageBase {
    public AccessValidationn(WebDriver navegador) {
        super(navegador);
    }

    public AccessValidationn newValidation() throws InterruptedException {
        openLateralMenu("//a[@ng-click='validarProfissionais()']");
        clickButton("//button[@data-target='.modal-validation']");
        return this;
    }

    public AccessValidationn saveValidation() {
        clickButton("//button[@ng-click='createValidation(form)']");
        toastValidation("Validação registrada com sucesso");
        return this;
    }

    public AccessValidationn typeIdentifier() {
        type("//input[@ng-model='form.identificador']", "SeleniumWD");
        return this;
    }

    public AccessValidationn editValidation() throws InterruptedException {
        openTypeFilter("//a[@ng-click='validarProfissionais()']", "//input[@id='filtroNome']","//button[@ng-click='filtrarAcesso()']");
        clickButton("//a[@title='Editar']");
        return this;
    }

    public AccessValidationn deleteValidation() throws InterruptedException {
        openTypeFilter("//a[@ng-click='validarProfissionais()']", "//input[@id='filtroNome']","//button[@ng-click='filtrarAcesso()']");
        clickButton("//a[@ng-click='deleteValidation(item.id, $index)']");
        clickButton("//button[@style='float: left;']");
        toastValidation("Registro excluído com sucesso");
        return this;
    }

    public AccessValidationn writeEverything() {
        type("//input[@ng-model='form.nome']", swd);
        type("//input[@ng-model='form.senha']", "1234567");
        selects("//select[@ng-model='form.perfil.id']", "MEDICO");
        return this;
    }

}
