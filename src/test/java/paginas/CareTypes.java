package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CareTypes extends PageBase{
    public CareTypes(WebDriver navegador) {
        super(navegador);
    }

    public CareTypes newCareType(){
        findByXPathClick("//button[@data-target='.modal-tipo-atendimento']");
        return this;
    }

    public CareTypes fillName(String name){
        navegador.findElement(By.xpath("//input[@ng-model='formEdit.name']")).sendKeys(name);
        return this;
    }

    public CareTypes selectSegment(String segment){
        WebElement campoType = navegador.findElement(By.xpath("//select[@ng-model='formEdit.segment']"));
        new Select(campoType).selectByVisibleText(segment);
        return this;
    }

    public CareTypes saveCareTypeCreate(){
        findByXPathClick("//a[@ng-click='cadastrarTipoAtendimento(formEdit.name, formEdit.segment)']");
        return this;
    }
    public CareTypes saveCareTypeEdit(){
        findByXPathClick("//a[@ng-click='salvarTipoAtendimento(formEdit.name, formEdit.segment)']");
        return this;
    }

    public CareTypes editCareType(){
        navegador.findElement(By.id("nameFilter")).sendKeys("01 - SWD");
        findByXPathClick("//button[@ng-click='filterTypeTreatments(1)']");
        findByXPathClick("//a[@data-target='.modal-tipo-atendimento']");
        return this;
    }

    public CareTypes cleanAll(){
        fillName(" ");
        selectSegment("Selecionar");
        return this;
    }

    public CareTypes fillCareType(){
        fillName("01 - SWD");
        selectSegment("Médico");
        return this;
    }

    public CareTypes successMessageEditCT( ){
        toastValidation("Edição realizada com sucesso");
        return this;
    }
    public CareTypes successMessageCT( ){
        toastValidation("Tipo de atendimento cadastrado com sucesso.");
        return this;
    }
}
