package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import paginas.AdministrativeGroups;
import paginas.DashPage;
import paginas.LoginPage;
import paginas.Quiz;
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
    public void admGroupCreate() {
        new AdministrativeGroups(navegador).groupCreate()
                .writeEverything().saveGroup().successMessage();
    }


    @Test
    public void validationCreate() {
        new DashPage(navegador).lateralMenuAccessValidation()
                .newValidation().fillAllValidationCreat()
                .saveValidation().sucessfulMessageAV();

    }

    @Test
    public void notificationCreate() {
        new DashPage(navegador).lateralMenuNotifications()
                .newNotification().fillAllinNotification("link e pdf aberto", "01092020", "1400'")
                .goToAddUsers().addUser().successMessageN();

    }

    @Test
    public void resultTypesCreate() {
        new DashPage(navegador).lateralMenuResultTypes()
                .newResult().fillAllInResult()
                .saveResultCreat().successMessageRT();
    }

    @Test
    public void careTypesCreate() {
        new DashPage(navegador).lateralMenuCareTypes()
                .newCareType().fillCareType()
                .saveCareTypeCreate().successMessageCT();
    }

    @Test
    public void unavailabilityTypesCreate() {
        new DashPage(navegador).lateralMenuUnavailabilityTypes()
                .newUnavailableType().fillUnavailabilityType()
                .saveUnavailableType().sucessMessageUT();
    }

    @Test
    public void PrioritiesCreate() {
        new DashPage(navegador).lateralPriorities()
                .newPriority().makeAll()
                .savePriority();
    }

    @After
    public void tearDown() {
        //navegador.quit();
    }
}
