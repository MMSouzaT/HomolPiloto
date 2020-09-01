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
    public void admGroupEdit() {
        new AdministrativeGroups(navegador).editGroup()
                .writeEverything().saveGroup().successMessageEdit();

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
    public void unavailabilityTypesEdit() {
        new DashPage(navegador).lateralMenuUnavailabilityTypes()
                .editUT().cleanAll()
                .fillUnavailabilityType()
                .saveUnavailableType().sucessMessageUT();
    }

    @Test
    public void PrioritiesEdit() {
        new DashPage(navegador).lateralPriorities()
                .editPrior().cleanALl()
                .makeAll().savePriority().delete();
    }

    @After
    public void tearDown() {
        //navegador.quit();
    }
}
