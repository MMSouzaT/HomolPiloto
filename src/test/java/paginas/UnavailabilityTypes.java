package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UnavailabilityTypes extends PageBase {
    public UnavailabilityTypes(WebDriver navegador) {
        super(navegador);

    }

    public UnavailabilityTypes newUnavailableType() throws InterruptedException {
        openLateralMenu("//a[@ng-click='tipoIndisponibilidade()']");
        clickButton("//button[@ng-click='loadModal()']");
        return this;
    }

    public UnavailabilityTypes saveUnavailableType() {
        clickButton("//a[@ng-click='cadastrarTipoIndisponibilidade()']");
        toastValidation("Tipo de indisponibilidade salva com sucesso.");
        return this;
    }

    public UnavailabilityTypes writeEverything() {
        type("//input[@ng-model='formEdit.name']", "01 - SWD");
        type("//input[@ng-model='formEdit.description']", "Description by SWD");
        return this;
    }

    public UnavailabilityTypes editUT() throws InterruptedException {
        openLateralMenu("//a[@ng-click='tipoIndisponibilidade()']");
        takeLineAndClick("//a[@title='Editar']");
        //caso único porque não tem filtro nesta aba
        return this;
    }

    public UnavailabilityTypes deleteUT() throws InterruptedException {
        openLateralMenu("//a[@ng-click='tipoIndisponibilidade()']");
        takeLineAndClick("//a[@title='Excluir']");
        clickButton("//button[@style='float: left;']");
        toastValidation("Registro excluído com sucesso");
        return this;
    }

    public void takeLineAndClick(String xpath) {
        WebElement pegandoLinha = navegador.findElement(By.xpath("//tr//td[contains(text(), '01 - SWD')]"));
        pegandoLinha.findElement(By.xpath(xpath)).click();
    }
}
