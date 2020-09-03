package paginas;

import org.openqa.selenium.WebDriver;

public class RoutingTypes extends PageBase{
    public RoutingTypes(WebDriver navegador) {
        super(navegador);
    }

    public RoutingTypes newRouting() throws InterruptedException {
        openLateralMenu("//a[@ng-click='tipoEncaminhamento()']");
        clickButton("//button[@ng-click='loadModal()']");
        return this;
    }
    public RoutingTypes writeEverything(){
        type("//input[@id='name']",swd);
        clickButton("//label[contains(text(), 'Unidade Padrão')]");
        saveRouting();
        return this;
    }
    public RoutingTypes saveRouting(){
        clickButton("//a[@ng-click='cadastrarTipoEncaminhamento()']");
        toastValidation("Tipo de encaminhamento salvo com sucesso.");
        return this;
    }

    public RoutingTypes editRouting() throws InterruptedException {
        openTypeFilter("//a[@ng-click='tipoEncaminhamento()']","//input[@id='healthUnit']","//button[@ng-click='filtrarTipoEncaminhamento()']");
        clickButton("//a[@title='Editar']");
        clickButton("//label[contains(text(), 'Unidade Padrão')]");
        writeEverything();
        return this;
    }

    public RoutingTypes deleteRouting() throws InterruptedException {
        openTypeFilter("//a[@ng-click='tipoEncaminhamento()']","//input[@id='healthUnit']","//button[@ng-click='filtrarTipoEncaminhamento()']");
        clickButton("//a[@title='Excluir']");
        clickButton("//button[@style='float: left;']");
        toastValidation("Registro excluído com sucesso");
        return this;
    }
}
