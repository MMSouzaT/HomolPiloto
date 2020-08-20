package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import paginas.LoginPage;
import suporte.Web;

public class HomolMeuMedicoCreateTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();

    }

    @Test
    public void groupCreate() {
        new LoginPage(navegador)
                .makeAllAboutLogin()
                .lateralMenuAdmGroups()
                .groupCreate()
                .fillAdmGroups()
                .saveGroup().successMessageAG();
    }


    @Test
    public void quizCreate() {
        new LoginPage(navegador)
                .makeAllAboutLogin().lateralMenuQuiz()
                .newQuiz().firstQuadrant()
                .secondQuadrant().thirdQuadrant()
                .newQuestion().subjetiveQuestion().saveQuiz()
                .deleteQuestion().newQuestion()
                .objetiveQuestion().activateQuiz().saveQuiz();
    }

    @Test
    public void validationCreate() {
        new LoginPage(navegador)
                .makeAllAboutLogin().lateralMenuAccessValidation()
                .newValidation().fillAllValidationCreat()
                .saveValidation().sucessfulMessageAV();

    }

    @Test
    public void notificationCreate() {
        new LoginPage(navegador)
                .makeAllAboutLogin().lateralMenuNotifications()
                .newNotification().fillAllinNotification("fechado","20082020", "1425")
                .goToAddUsers().addUser().successMessageN();

    }

    @Test
    public void resultTypesCreate() {
        new LoginPage(navegador)
                .makeAllAboutLogin().lateralMenuResultTypes()
                .newResult().fillAllInResult()
                .saveResultCreat().successMessageRT();
    }

    @Test
    public void careTypesCreate() {
        new LoginPage(navegador)
                .makeAllAboutLogin().lateralMenuCareTypes()
                .newCareType().fillCareType()
                .saveCareTypeCreate().successMessageCT();
    }

    @Test
    public void unavailabilityTypesCreate(){
        new LoginPage(navegador)
                .makeAllAboutLogin().lateralMenuUnavailabilityTypes()
                .newUnavailableType().fillUnavailabilityType()
                .saveUnavailableType().sucessMessageUT();
    }

    @After
    public void tearDown() {
        //navegador.quit();
    }
}
