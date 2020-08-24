package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import paginas.DashPage;
import paginas.LoginPage;
import suporte.Web;

public class HomolMeuMedicoCreateTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
        new LoginPage(navegador).makeAllAboutLogin();

    }

    @Test
    public void groupCreate() {
        new DashPage(navegador)
                .lateralMenuAdmGroups()
                .groupCreate()
                .fillAdmGroups()
                .saveGroup().successMessageAG();
    }


    @Test
    public void quizCreate() {
        new DashPage(navegador).lateralMenuQuiz()
                .newQuiz().firstQuadrant()
                .secondQuadrant().thirdQuadrant()
                .newQuestion().subjetiveQuestion().saveQuiz()
                .deleteQuestion().newQuestion()
                .objetiveQuestion().activateQuiz().saveQuiz();
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
                .newNotification().fillAllinNotification("teste de travamento","24082020", "2359")
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
    public void unavailabilityTypesCreate(){
        new DashPage(navegador).lateralMenuUnavailabilityTypes()
                .newUnavailableType().fillUnavailabilityType()
                .saveUnavailableType().sucessMessageUT();
    }

    @After
    public void tearDown() {
        //navegador.quit();
    }
}
