package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UnavailabilityTypes extends PageBase{
    public UnavailabilityTypes(WebDriver navegador) {
        super(navegador);

    }
    public UnavailabilityTypes newUnavailableType(){
        findByXPathClick("//button[@ng-click='loadModal()']");
        return this;
    }

    public UnavailabilityTypes fillName(String name){
        navegador.findElement(By.xpath("//input[@ng-model='formEdit.name']")).sendKeys(name);
        return this;
    }
    public UnavailabilityTypes fillDescription(String description){
        navegador.findElement(By.xpath("//input[@ng-model='formEdit.description']")).sendKeys(description);
        return this;
    }

    public UnavailabilityTypes saveUnavailableType(){
        findByXPathClick("//a[@ng-click='cadastrarTipoIndisponibilidade()']");
        return this;
    }
    public UnavailabilityTypes fillUnavailabilityType(){
        fillName("01 - SWD");
        fillDescription("Description by SWD");
        return this;
    }

    public UnavailabilityTypes cleanAll(){
        fillName(" ");
        fillDescription(" ");
        return this;
    }

    public UnavailabilityTypes editUT(){
        //ainda não tem como ser feito da melhor forma possível porque não tem filtro
        WebElement pegandoLinha = navegador.findElement(By.xpath("//tr/td[@class='ng-binding']"));
        return this;
    }

    public UnavailabilityTypes sucessMessageUT(){
        toastValidation("Tipo de indisponibilidade salva com sucesso.");
        return this;
    }
}
