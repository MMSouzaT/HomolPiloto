package paginas;

import org.openqa.selenium.WebDriver;

public class Priorities extends PageBase{
    public Priorities(WebDriver navegador) {
        super(navegador);
    }

    public Priorities newPriority() throws InterruptedException {
        openLateralMenu("//a[@ng-click='prioridade()']");
        clickButton("//button[@data-target='.modal-priorities']");
        return this;
    }

    public Priorities writeEverything(){
        type("//input[@id='title']",swd);
        type("//input[@id='weight']","80");
        selects("//select[@id='selectSegment']","Médico");
        clickButton("//button[@id='cor']");
        clickButton("//button[@title='Roxo']");
        clickButton("//a[@ng-click='createUpdatePriority()']");
        toastValidation("Prioridade cadastrada com sucesso");
        return this;
    }

    public Priorities editPrior() throws InterruptedException {
        openTypeFilter("//a[@ng-click='prioridade()']", "//input[@id='filterTitle']","//button[@ng-click='filterPriorities(1)']" );
        clickButton("//a[@title='Editar']");
        return this;
    }
    public Priorities deletePrior() throws InterruptedException {
        openTypeFilter("//a[@ng-click='prioridade()']", "//input[@id='filterTitle']","//button[@ng-click='filterPriorities(1)']" );
        clickButton("//a[@ng-click='deletePriority(item.id)']");
        clickButton("//button[@style='float: left;']");
        toastValidation("Registro excluído com sucesso");
        return this;
    }

}
