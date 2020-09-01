package testes;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import paginas.AdministrativeGroups;
import paginas.LoginPage;
import suporte.Web;

public class HomolmeumedicoDeleteTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
        new LoginPage(navegador).makeAllAboutLogin();
    }

    @Test
    public void quizDelete(){

    }

    @Test
    public void admGroupDelete() {
        new AdministrativeGroups(navegador).deleteGroup();

    }

}
