package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashPage extends PageBase {
    public DashPage(WebDriver navegador) {
        super(navegador);
    }

    public void openLateralMenu(){
        navegador.findElement(By.className("icon-open")).click();

    }

    public Quiz lateralMenuQuiz(){
        openLateralMenu();
        findByXPathClick("//a[@ng-click='questionarios()']");
        return new Quiz(navegador);
    }
    public AccessValidation lateralMenuAccessValidation(){
        openLateralMenu();
        findByXPathClick("//a[@ng-click='validarProfissionais()']");
        return new AccessValidation(navegador);
    }
    public ResultTypes lateralMenuResultTypes(){
        openLateralMenu();
        findByXPathClick("//a[@ng-click='resultados()']");
        return new ResultTypes(navegador);
    }
    public CareTypes lateralMenuCareTypes(){
        openLateralMenu();
        findByXPathClick("//a[@ng-click='tipoAtendimentos()']");
        return new CareTypes(navegador);
    }
    public UnavailabilityTypes lateralMenuUnavailabilityTypes(){
        openLateralMenu();
        findByXPathClick("//a[@ng-click='tipoIndisponibilidade()']");
        return new UnavailabilityTypes(navegador);
    }
    public Notifications lateralMenuNotifications(){
        openLateralMenu();
        findByXPathClick("//a[@ng-click='notificacoes()']");
        return new Notifications(navegador);
    }

    public RoutingTypes lateralMenuRouting(){
        openLateralMenu();
        findByXPathClick("//a[@ng-click='tipoEncaminhamento()']");
        return new RoutingTypes(navegador);
    }

    public HealthUnits lateralMenuHealthUnits(){
        openLateralMenu();
        findByXPathClick("//a[@ng-click='unidadeSaude()']");
        return new HealthUnits(navegador);
    }
    public Priorities lateralPriorities(){
        openLateralMenu();
        findByXPathClick("//a[@ng-click='prioridade()']");
        return new Priorities(navegador);
    }


}
