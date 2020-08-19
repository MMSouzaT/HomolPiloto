package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ResultTypes extends PageBase {
    public ResultTypes(WebDriver navegador) {
        super(navegador);
    }

    public ResultTypes newResult() {
        findByXPathClick("//button[@ng-click='loadModal()']");
        return this;
    }

    public ResultTypes selectSegment(String segment) {
        WebElement campoType = navegador.findElement(By.id("segment"));
        new Select(campoType).selectByVisibleText(segment);
        return this;
    }

    public ResultTypes fillName(String name) {
        navegador.findElement(By.id("name")).sendKeys(name);
        return this;
    }

    public ResultTypes saveResultCreat() {
        findByXPathClick("//a[@ng-click='cadastrarResultado(formEdit.name, formEdit.productive, formEdit.segment, formEdit.activeForwarding, formEdit.sendForm)']");

        return this;
    }
    public ResultTypes saveResultEdit() {
        findByXPathClick("//a[@ng-click='salvarResultado(formEdit.name, formEdit.productive, formEdit.segment, formEdit.activeForwarding, formEdit.sendForm)']");

        return this;
    }

    public ResultTypes editResult() {
        navegador.findElement(By.id("filtroNome")).sendKeys("01 - SWD");
        findByXPathClick("//button[@ng-click='filterResults(1)']");
        findByXPathClick("//a[@data-target='.modal-resultados']");
        return this;
    }

    public ResultTypes cleanResult() {
        fillName(" ");
        selectSegment("Selecionar");
        return this;
    }

    public ResultTypes fillAllInResult() {
        fillName("01 - SWD");
        selectSegment("Médico");
        return this;
    }
}
