package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
        type("//input[@id='title']","01 - SWD");
        type("//input[@id='weight']","80");
        selects("//select[@id='selectSegment']","Médico");
        clickButton("//button[@id='cor']");
        clickButton("//button[@title='Roxo']");
        clickButton("//a[@ng-click='createUpdatePriority()']");
        toastValidation("Prioridade cadastrada com sucesso");
        return this;
    }

    public Priorities editPrior() throws InterruptedException {
        openTypeFilter();
        clickButton("//a[@title='Editar']");
        return this;
    }
    public Priorities deletePrior() throws InterruptedException {
        openTypeFilter();
        clickButton("//a[@ng-click='deletePriority(item.id)']");
        clickButton("//button[@style='float: left;']");
        toastValidation("Registro excluído com sucesso");
        return this;
    }

    public void openTypeFilter() throws InterruptedException {
        openLateralMenu("//a[@ng-click='prioridade()']");
        type("//input[@id='filterTitle']","01 - SWD");
        clickButton("//button[@ng-click='filterPriorities(1)']");
    }

}
