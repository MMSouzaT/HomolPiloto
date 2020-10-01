package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import paginas.*;
import suporte.Web;

public class A01HomolMeuMedicoEditTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
        new PageBase(navegador).SignIn();
    }

    @Test
    public void quizEdit() throws InterruptedException {
        new Quiz(navegador).editQuiz()
                .firstQuadrant().secondQuadrant().thirdQuadrant()
                .subjetiveQuestion()
                .deleteQuestion().objetiveQuestion();
    }

    @Test
    public void admGroupEdit() throws InterruptedException {
        new AdministrativeGroups(navegador).editGroup()
                .writeEverything().successMessageEdit();
    }

    @Test
    public void accessValidationEdit() throws InterruptedException {
        new AccessValidationn(navegador).editValidation().writeEverything()
                .saveValidation();

    }

    @Test
    public void resultTypesEdit() throws InterruptedException {
        new ResultTypes(navegador).editResult().writeEverything()
                .saveResultEdit();
    }

    @Test
    public void careTypesEdit() throws InterruptedException {
        new CareTypes(navegador).editCareType().writeEverything().saveCareTypeEdit();
    }

    @Test
    public void unavailabilityTypesEdit() throws InterruptedException {
        new UnavailabilityTypes(navegador).editUT().writeEverything().saveUnavailableType();
    }

    @Test
    public void routingTypesEdit() throws InterruptedException{
        new RoutingTypes(navegador).editRouting();
    }
    @Test
    public void healthUnitsEdit() throws InterruptedException {
        new HealthUnits(navegador).editHealthUnit().writeEverything();
    }

    @Test
    public void notificationEdit() throws InterruptedException{
        new Notifications(navegador).editNotification()
                .writeEverything("01 - SWD", "31122020", "2359")
                .deleteUser().addUser();
    }

    @Test
    public void PrioritiesEdit() throws InterruptedException {
        new Priorities(navegador).editPrior().writeEverything();
    }

//    @Test
//    public void CategoriesEdit() throws InterruptedException{
//        new FAQCategories(navegador).editCategory().writeEverything();
//    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(500);
        navegador.quit();
    }
}
