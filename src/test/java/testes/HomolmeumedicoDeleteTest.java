package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import paginas.*;
import suporte.Web;

public class HomolmeumedicoDeleteTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
        new LoginPage(navegador).makeAllAboutLogin();
    }

    @Test
    public void quizDelete() throws InterruptedException {
        new Quiz(navegador).deleteQuiz().successDeleteMessage();
    }

    @Test
    public void admGroupDelete() throws InterruptedException {
        new AdministrativeGroups(navegador).deleteGroup();
    }

    @Test
    public void accessValidationDelete() throws InterruptedException {
        new AccessValidation(navegador).deleteValidation();
    }

    @Test
    public void resultTypesDelete() throws InterruptedException {
        new ResultTypes(navegador).deleteResult();
    }

    @Test
    public void careTypesDelete() throws InterruptedException{
        new CareTypes(navegador).deleteCareType();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(500);
        navegador.quit();
    }

}
