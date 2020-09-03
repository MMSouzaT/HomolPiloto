package paginas;

import org.openqa.selenium.WebDriver;

public class HealthUnits extends PageBase {
    public HealthUnits(WebDriver navegador) {
        super(navegador);
    }

    public HealthUnits newHealthUnit() throws InterruptedException {
        openLateralMenu("//a[@ng-click='unidadeSaude()']");
        clickButton("//button[@ng-click='loadModal()']");
        return this;
    }

    public HealthUnits writeEverything() throws InterruptedException {
        type("//input[@ng-model='formEdit.name']", swd);
        type("//input[@ng-model='formEdit.phone']", "7199999999");
        type("//textarea[@ng-model='formEdit.address']", "Rua do Java");
        selects("//select[@id='selectUf']", "BA");
        waitHalfASecond();
        clickButton("//button[@ng-click='adicionarTodasCidades()']");
        clickButton("//a[@ng-click='cadastrarEditarUnidadeSaude()']");
        toastValidation("Unidade de Saúde salva com sucesso.");
        return this;
    }

    public HealthUnits editHealthUnit() throws InterruptedException {
        openTypeFilter("//a[@ng-click='unidadeSaude()']", "//input[@id='filtroNome']", "//button[@ng-click='filterUnidadeSaude(1)']");
        clickButton("//a[@ng-click='editarUnidadeSaude(item)']");
        waitHalfASecond();
        return this;
    }

    public HealthUnits deleteHealthUnit() throws InterruptedException {
        openTypeFilter("//a[@ng-click='unidadeSaude()']", "//input[@id='filtroNome']", "//button[@ng-click='filterUnidadeSaude(1)']");
        clickButton("//a[@ng-click='deletarUnidadeSaude(item.id)']");
        clickButton("//button[@style='float: left;']");
        toastValidation("Registro excluído com sucesso");
        return this;
    }
}
