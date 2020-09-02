package paginas;

import org.openqa.selenium.WebDriver;

public class HealthUnits extends PageBase{
    public HealthUnits(WebDriver navegador) {
        super(navegador);
    }
    public HealthUnits newHealthUnit() throws InterruptedException {
        openLateralMenu("//a[ng-click='unidadeSaude()']");
        clickButton("//button[@ng-click='loadModal()']");
        return this;
    }

    public HealthUnits writeEverything(){
        type("//input[@ng-model='formEdite.name']","01 - SWD");
        type("//input[@ng-model='formEdite.phone']","7199999999");
        type("//textarea[@ng-model='formEdit.address']","Rua do Java");
        selects("//select[@id='selectUf']","BA");
        clickButton("//button[@ng-click='adicionarTodasCidades()']");
        clickButton("//a[@ng-click='cadastrarEditarUnidadeSaude()']");
        toastValidation("Unidade de Saúde salva com sucesso.");
        return this;
    }

    public HealthUnits editHealthUnit() throws InterruptedException {
        openTypeFilter();
        writeEverything();
        return this;
    }

    public HealthUnits deleteHealthUnit() throws InterruptedException{
        openTypeFilter();
        clickButton("//a[@ng-click='deletarUnidadeSaude(item.id)']");
        clickButton("//button[@style='float: left;']");
        toastValidation("Registro excluído com sucesso");
        return this;
    }

    public void openTypeFilter() throws InterruptedException {
        openLateralMenu("//a[ng-click='unidadeSaude()']");
        type("//input[@id='filtroNome']","01 - SWD");
        clickButton("//button[@ng-click='filterUnidadeSaude(1)']");
    }
}
