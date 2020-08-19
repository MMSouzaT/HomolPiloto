package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccessValidation extends PageBase {
    public AccessValidation(WebDriver navegador) {
        super(navegador);
    }

    public AccessValidation newValidation() {
        findByXPathClick("//button[@data-target='.modal-validation']");
        return this;
    }

    public AccessValidation saveValidation() {
        findByXPathClick("//button[@ng-click='createValidation(form)']");
        return this;
    }

    public AccessValidation typeName(String name) {
        navegador.findElement(By.id("formNome")).sendKeys(name);
        return this;
    }

    public AccessValidation typeIdentifier(String identifier) {
        navegador.findElement(By.id("formIndentificador")).sendKeys(identifier);
        return this;

    }

    public AccessValidation typePassword(String password) {
        navegador.findElement(By.id("formSenha")).sendKeys(password);
        return this;
    }

    public AccessValidation selectSegment(String segment) {
        WebElement campoType = navegador.findElement(By.id("formPerfil"));
        new Select(campoType).selectByVisibleText(segment);
        return this;
    }

    public AccessValidation editValidation() {
        navegador.findElement(By.id("filtroNome")).sendKeys("01 - SWD");
        findByXPathClick("//button[@ng-click='filtrarAcesso()']");
        findByXPathClick("//a[@title='Editar']");
        return this;
    }

    public AccessValidation cleanValidation(){
        typeName("");
        typePassword("");
        selectSegment("Selecionar");
        return this;
    }

    public AccessValidation fillAllValidationCreat() {
        typeName("01 - SWD");
        typeIdentifier("SeleniumWD");
        typePassword("1234567");
        selectSegment("PACIENTE");
        return this;
    }

    public AccessValidation fillAllValidationEdit() {
        typeName("02 - SWD");
        typePassword("7654321");
        selectSegment("MEDICO");
        return this;
    }

}
