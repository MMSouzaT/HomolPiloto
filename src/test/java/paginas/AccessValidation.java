package paginas;

import org.openqa.selenium.WebDriver;

public class AccessValidation extends PageBase {
    public AccessValidation(WebDriver navegador) {
        super(navegador);
    }

    public AccessValidation newValidation() throws InterruptedException {
        openLateralMenu("//a[@ng-click='validarProfissionais()']");
        clickButton("//button[@data-target='.modal-validation']");
        return this;
    }

    public AccessValidation saveValidation() {
        clickButton("//button[@ng-click='createValidation(form)']");
        toastValidation("Validação registrada com sucesso");
        return this;
    }

    public AccessValidation typeIdentifier() {
        type("//input[@ng-model='form.identificador']", "SeleniumWD");
        return this;
    }

    public AccessValidation editValidation() throws InterruptedException {
        openTypeFilter("//a[@ng-click='validarProfissionais()']", "//input[@id='filtroNome']","//button[@ng-click='filtrarAcesso()']");
        clickButton("//a[@title='Editar']");
        return this;
    }

    public AccessValidation deleteValidation() throws InterruptedException {
        openTypeFilter("//a[@ng-click='validarProfissionais()']", "//input[@id='filtroNome']","//button[@ng-click='filtrarAcesso()']");
        clickButton("//a[@ng-click='deleteValidation(item.id, $index)']");
        clickButton("//button[@style='float: left;']");
        toastValidation("Registro excluído com sucesso");
        return this;
    }

    public AccessValidation writeEverything() {
        type("//input[@ng-model='form.nome']", swd);
        type("//input[@ng-model='form.senha']", "1234567");
        selects("//select[@ng-model='form.perfil.id']", "MEDICO");
        return this;
    }

}
