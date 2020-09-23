package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import paginas.*;
import suporte.Web;

public class A02HomolmeumedicoDeleteTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
        new PageBase(navegador).SignIn();
    }

    @Test
    public void quizDelete() throws InterruptedException {
        new Quiz(navegador).deleteQuiz().successDeleteMessage();
    }

    @Test
    public void admGroupDelete() throws InterruptedException {
        new AdministrativeGroups(navegador).deleteGroup();
    }

    @Test
    public void accessValidationDelete() throws InterruptedException {
        new AccessValidation(navegador).deleteValidation();
    }

    @Test
    public void resultTypesDelete() throws InterruptedException {
        new ResultTypes(navegador).deleteResult();
    }

    @Test
    public void careTypesDelete() throws InterruptedException{
        new CareTypes(navegador).deleteCareType();
    }

    @Test
    public  void unavailabilityTypesDelete() throws InterruptedException{
        new UnavailabilityTypes(navegador).deleteUT();
    }

    @Test
    public void routingTypesDelete() throws InterruptedException{
        new RoutingTypes(navegador).deleteRouting();
    }

    @Test
    public void healthUnitsDelete() throws InterruptedException {
        new HealthUnits(navegador).deleteHealthUnit();
    }

    @Test
    public void deleteNotification() throws InterruptedException{
        new Notifications(navegador).deleteNotification();
    }

    @Test
    public void PrioritiesDelete() throws InterruptedException {
        new Priorities(navegador).deletePrior();
    }

//    @Test
//    public void CategoriesDelete() throws InterruptedException{
//        new FAQCategories(navegador).deleteCategory();
//    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(500);
        navegador.quit();
    }

}
