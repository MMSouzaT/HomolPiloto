package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
        type("//input[@ng-model='form.identificador']","SeleniumWD");
        return this;
    }

    public AccessValidation editValidation() throws InterruptedException {
        openTypeFilter();
        clickButton("//a[@title='Editar']");
        return this;
    }

    public AccessValidation deleteValidation() throws InterruptedException {
        openTypeFilter();
        clickButton("//a[@ng-click='deleteValidation(item.id, $index)']");
        clickButton("//button[@style='float: left;']");
        toastValidation("Registro excluído com sucesso");
        return this;
    }

    public void openTypeFilter() throws InterruptedException {
        openLateralMenu("//a[@ng-click='validarProfissionais()']");
        type("//input[@id='filtroNome']","01 - SWD");
        clickButton("//button[@ng-click='filtrarAcesso()']");
    }

    public AccessValidation writeEverything() {
        type("//input[@ng-model='form.nome']","01 - SWD");
        type("//input[@ng-model='form.senha']", "1234567");
        selects("//select[@ng-model='form.perfil.id']","MEDICO");
        return this;
    }

}
