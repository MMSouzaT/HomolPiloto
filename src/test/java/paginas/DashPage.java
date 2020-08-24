package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashPage extends PageBase {
    public DashPage(WebDriver navegador) {
        super(navegador);
    }

    public AdministrativeGroups lateralMenuAdmGroups(){
        navegador.findElement(By.className("icon-open")).click();
        findByXPathClick("//a[@ng-click='grupos()']");
        return new AdministrativeGroups(navegador);
    }

    public Quiz lateralMenuQuiz(){
        navegador.findElement(By.className("icon-open")).click();
        findByXPathClick("//a[@ng-click='questionarios()']");
        return new Quiz(navegador);
    }
    public AccessValidation lateralMenuAccessValidation(){
        navegador.findElement(By.className("icon-open")).click();
        findByXPathClick("//a[@ng-click='validarProfissionais()']");
        return new AccessValidation(navegador);
    }
    public ResultTypes lateralMenuResultTypes(){
        navegador.findElement(By.className("icon-open")).click();
        findByXPathClick("//a[@ng-click='resultados()']");
        return new ResultTypes(navegador);
    }
    public CareTypes lateralMenuCareTypes(){
        navegador.findElement(By.className("icon-open")).click();
        findByXPathClick("//a[@ng-click='tipoAtendimentos()']");
        return new CareTypes(navegador);
    }
    public UnavailabilityTypes lateralMenuUnavailabilityTypes(){
        navegador.findElement(By.className("icon-open")).click();
        findByXPathClick("//a[@ng-click='tipoIndisponibilidade()']");
        return new UnavailabilityTypes(navegador);
    }
    public Notifications lateralMenuNotifications(){
        navegador.findElement(By.className("icon-open")).click();
        findByXPathClick("//a[@ng-click='notificacoes()']");
        return new Notifications(navegador);
    }


}
