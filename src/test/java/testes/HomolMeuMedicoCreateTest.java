package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import paginas.*;
import suporte.Web;

public class HomolMeuMedicoCreateTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
        new LoginPage(navegador).makeAllAboutLogin();

    }

    @Test
    public void quizCreate() throws InterruptedException {
        new Quiz(navegador)
                .newQuiz().firstQuadrant()
                .secondQuadrant().thirdQuadrant()
                .newQuestion().subjetiveQuestion().saveQuiz()
                .deleteQuestion().newQuestion()
                .objetiveQuestion().activateQuiz().saveQuiz();
    }

    @Test
    public void admGroupCreate() throws InterruptedException {
        new AdministrativeGroups(navegador).groupCreate()
                .writeEverything().saveGroup().successMessage();
    }


    @Test
    public void accessValidationCreate() throws InterruptedException {
        new AccessValidation(navegador).newValidation().writeEverything().typeIdentifier()
                .saveValidation();

    }

    @Test
    public void resultTypesCreate() throws InterruptedException {
        new ResultTypes(navegador).newResult().writeEverything()
                .saveResultCreat();
    }

    @Test
    public void careTypesCreate() throws InterruptedException {
        new CareTypes(navegador).newCareType().writeEverything().saveCareTypeCreate();
    }

    @Test
    public void unavailabilityTypesCreate() throws InterruptedException {
        new UnavailabilityTypes(navegador).newUnavailableType().writeEverything().saveUnavailableType();
    }

    @Test
    public void routingTypesCreate() throws InterruptedException{
        new RoutingTypes(navegador).newRouting().writeEverything();
    }

    @Test
    public void notificationCreate() throws InterruptedException {
         new Notifications(navegador)
                 .newNotification().writeEverything("Automação Topos Informática", "31122020", "2359'").addUser();
    }

    @Test
    public void PrioritiesCreate() throws InterruptedException {
        new Priorities(navegador).newPriority().writeEverything();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(500);
        navegador.quit();
    }
}
