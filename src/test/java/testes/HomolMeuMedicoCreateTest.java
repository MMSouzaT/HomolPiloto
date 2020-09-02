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
    public void validationCreate() throws InterruptedException {
        new AccessValidation(navegador).newValidation().writeEverything().typeIdentifier()
                .saveValidation().sucessfulMessageAV();

    }


    @Test
    public void notificationCreate() throws InterruptedException {
        int i;
        for (i = 0; i <= 4; i++) {
            new DashPage(navegador).lateralMenuNotifications()
                    .newNotification().fillAllinNotification("not" + i, "02092020", "1004'")
                    .goToAddUsers().addUser().waitHalfASecond();//.successMessageN();
        }
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
    public void tearDown() throws InterruptedException {
        Thread.sleep(500);
        navegador.quit();
    }
}
