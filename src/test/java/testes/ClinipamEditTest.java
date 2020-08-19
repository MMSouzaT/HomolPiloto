package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import paginas.LoginPage;
import suporte.Web;

public class ClinipamEditTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();

    }

    @Test
    public void groupEdit() {
        new LoginPage(navegador)
                .makeAllAboutLogin()
                .lateralMenuAdmGroups()
                .editGroup()
                .cleanAllAboutAG()
                .fillAdmGroups()
                .saveGroup();
    }

    @Test
    public void QuizEdit() {
        new LoginPage(navegador)
                .makeAllAboutLogin().lateralMenuQuiz()
                .editQuiz().cleanAllAboutQuiz()
                .firstQuadrant().secondQuadrant()
                .thirdQuadrant().newQuestion()
                .subjetiveQuestion().saveQuiz()
                .deleteQuestion()
                .newQuestion().objetiveQuestion()
                .activateQuiz().saveQuiz();
    }

    @Test
    public void validationEdit() {
        new LoginPage(navegador)
                .makeAllAboutLogin().lateralMenuAccessValidation()
                .editValidation().cleanValidation()
                .fillAllValidationEdit().saveValidation();

    }

    @Test
    public void resultTypesEdit() {
        new LoginPage(navegador)
                .makeAllAboutLogin().lateralMenuResultTypes()
                .editResult().cleanResult()
                .fillAllInResult()
                .saveResultEdit();
    }

    @Test
    public void careTypesCreate() {
        new LoginPage(navegador)
                .makeAllAboutLogin().lateralMenuCareTypes()
                .editCareType().cleanAll()
                .fillCareType().saveCareTypeEdit();
    }

    @After
    public void tearDown() {
        navegador.quit();
    }
}
