package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Priorities extends PageBase{
    public Priorities(WebDriver navegador) {
        super(navegador);
    }

    public Priorities newPriority(){
        findByXPathClick("//button[@data-target='.modal-priorities']");
        return this;
    }

    public Priorities typeTitle(String title){
        navegador.findElement(By.id("title")).sendKeys(title);
        return this;
    }
    public Priorities typeWeight(String weight){
        navegador.findElement(By.id("weight")).sendKeys(weight);
        return this;
    }

    public Priorities selectSegment(String text) {
        WebElement campoType = navegador.findElement(By.name("selectSegment"));
        new Select(campoType).selectByVisibleText(text);
        return this;
    }

    public Priorities takeColor(){
        findByIdClick("cor");
        findByXPathClick("//button[@title='Roxo']");
        return this;
    }

    public Priorities savePriority(){
        findByXPathClick("//a[@ng-click='createUpdatePriority()']");
        return this;
    }

    public Priorities makeAll(){
        typeTitle("01 - SWD");
        typeWeight("80");
        selectSegment("Médico");
        takeColor();
        return this;
    }

    public Priorities cleanALl(){
        typeTitle("");
        typeWeight("");
        selectSegment("Selecionar");
        return this;
    }
    public Priorities editPrior() {
        navegador.findElement(By.id("filterTitle")).sendKeys("01 - SWD");
        findByXPathClick("//button[@ng-click='filterPriorities(1)']");
        findByXPathClick("//a[@title='Editar']");
        return this;
    }
    public Priorities delete(){
        findByXPathClick("//a[@ng-click='deletePriority(item.id)']");
        findByLinkTextClick("Sim");
        return this;
    }

}
