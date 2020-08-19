package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashPage extends PageBase {
    public DashPage(WebDriver navegador) {
        super(navegador);
    }

    public AdministrativeGroups lateralMenuAdmGroups(){
        navegador.findElement(By.className("icon-open")).click();
        navegador.findElement(By.linkText("GRUPOS ADMINISTRATIVOS")).click();
        return new AdministrativeGroups(navegador);
    }

    public Quiz lateralMenuQuiz(){
        navegador.findElement(By.className("icon-open")).click();
        navegador.findElement(By.linkText("QUESTIONÁRIOS")).click();
        return new Quiz(navegador);
    }
    public AccessValidation lateralMenuAccessValidation(){
        navegador.findElement(By.className("icon-open")).click();
        navegador.findElement(By.linkText("VALIDAÇÃO DE ACESSO")).click();
        return new AccessValidation(navegador);
    }
    public ResultTypes lateralMenuResultTypes(){
        navegador.findElement(By.className("icon-open")).click();
        navegador.findElement(By.linkText("TIPOS DE RESULTADO")).click();
        return new ResultTypes(navegador);
    }
    public CareTypes lateralMenuCareTypes(){
        navegador.findElement(By.className("icon-open")).click();
        navegador.findElement(By.linkText("TIPOS DE ATENDIMENTO")).click();
        return new CareTypes(navegador);
    }
    public UnavailabilityTypes lateralMenuUnavailabilityTypes(){
        navegador.findElement(By.className("icon-open")).click();
        navegador.findElement(By.linkText("TIPOS DE INDISPONIBILIDADE")).click();
        return new UnavailabilityTypes(navegador);
    }
    public Notifications lateralMenuNotifications(){
        navegador.findElement(By.className("icon-open")).click();
        navegador.findElement(By.linkText("NOTIFICAÇÕES")).click();
        return new Notifications(navegador);
    }


}
