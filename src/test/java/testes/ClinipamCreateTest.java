package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import paginas.LoginPage;
import suporte.Web;

public class ClinipamCreateTest {
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
                .saveGroup();
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
                .newValidation().fillAllValidationCreat().saveValidation();

    }

    @Test
    public void notificationCreate() {
        new LoginPage(navegador)
                .makeAllAboutLogin().lateralMenuNotifications()
                .newNotification().fillAllinNotification("notificaçao tela","19082020", "0905")
                .addUsers().addUserClinipam();

    }

    @Test
    public void resultTypesCreate() {
        new LoginPage(navegador)
                .makeAllAboutLogin().lateralMenuResultTypes()
                .newResult().fillAllInResult()
                .saveResultCreat();
    }

    @Test
    public void careTypesCreate() {
        new LoginPage(navegador)
                .makeAllAboutLogin().lateralMenuCareTypes()
                .newCareType().fillCareType()
                .saveCareTypeCreate();
    }

    @After
    public void tearDown() {
        navegador.quit();
    }
}
