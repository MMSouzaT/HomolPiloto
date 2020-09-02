package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import paginas.*;
import suporte.Web;

public class HomolMeuMedicoEditTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
        new LoginPage(navegador).makeAllAboutLogin();
    }

    @Test
    public void quizEdit() throws InterruptedException {
        new Quiz(navegador).editQuiz()
                .firstQuadrant().secondQuadrant().thirdQuadrant()
                .newQuestion().subjetiveQuestion().saveQuiz()
                .deleteQuestion().newQuestion().objetiveQuestion().saveQuiz();
    }

    @Test
    public void admGroupEdit() throws InterruptedException {
        new AdministrativeGroups(navegador).editGroup()
                .writeEverything().saveGroup().successMessageEdit();

    }

    @Test
    public void accessValidationEdit() throws InterruptedException {
        new AccessValidation(navegador).editValidation().writeEverything()
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
    public void PrioritiesEdit() throws InterruptedException {
        new Priorities(navegador).editPrior().writeEverything();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(500);
        navegador.quit();
    }
}
