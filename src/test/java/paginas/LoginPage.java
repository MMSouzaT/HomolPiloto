package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginPage typeLogin(String login){
        navegador.findElement(By.id("matriculaSms")).sendKeys(login);
        return this;
    }
    public LoginPage typePassword(String password){
        navegador.findElement(By.id("senha")).sendKeys(password);
        return this;
    }

    public DashPage clickSignIn(){
        navegador.findElement(By.className("btn-padrao")).click();
        return new DashPage(navegador);
    }

    public DashPage makeAllAboutLogin(){
        typeLogin("00888888888");
        typePassword("3322");
        clickSignIn();
        return new DashPage(navegador);
    }
}
