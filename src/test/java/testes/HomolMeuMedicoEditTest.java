package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import paginas.DashPage;
import paginas.LoginPage;
import suporte.Web;

public class HomolMeuMedicoEditTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
        new LoginPage(navegador).makeAllAboutLogin();
    }

    @Test
    public void groupEdit() {
        new DashPage(navegador)
                .lateralMenuAdmGroups()
                .editGroup()
                .cleanAllAboutAG()
                .fillAdmGroups()
                .saveGroup()
                .successMessageEditAG();
    }

    @Test
    public void QuizEdit() {
        new DashPage(navegador).lateralMenuQuiz()
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
        new DashPage(navegador).lateralMenuAccessValidation()
                .editValidation().cleanValidation()
                .fillAllValidationEdit().saveValidation()
                .sucessfulMessageAV();

    }

    @Test
    public void resultTypesEdit() {
        new DashPage(navegador).lateralMenuResultTypes()
                .editResult().cleanResult()
                .fillAllInResult()
                .saveResultEdit().successMessageEditRT();
    }

    @Test
    public void careTypesEdit() {
        new DashPage(navegador).lateralMenuCareTypes()
                .editCareType().cleanAll()
                .fillCareType().saveCareTypeEdit().successMessageEditCT();
    }

    @Test
    public void unavailabilityTypesEdit(){
        new DashPage(navegador).lateralMenuUnavailabilityTypes()
                .editUT().cleanAll()
                .fillUnavailabilityType()
                .saveUnavailableType().sucessMessageUT();
    }
    @After
    public void tearDown() {
        navegador.quit();
    }
}
