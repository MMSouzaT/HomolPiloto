package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Notifications extends PageBase {
    public Notifications(WebDriver navegador) {
        super(navegador);
    }

    public Notifications newNotification() {
        findByXPathClick("//a[@ng-click='CreateNotification()']");
        return this;
    }

    public Notifications addUsers() {
        findByXPathClick("//button[@ng-click='salvarNotificacao()']");
        return this;
    }

    public Notifications onlySave() {
        findByXPathClick("//button[@ng-click='savingNotification']");
        return this;
    }

    public Notifications typeTitle(String title) {
        navegador.findElement(By.id("form.title")).sendKeys(title);
        return this;
    }

    public Notifications typeMessage() {
        navegador.findElement(By.id("message")).sendKeys("Message by SWD");
        return this;
    }

    public Notifications typeData(String data) {
        navegador.findElement(By.id("send_date")).sendKeys(data);
        return this;
    }

    public Notifications typeHour(String hour) {
        navegador.findElement(By.id("send_hour")).sendKeys(hour);
        return this;
    }

    public Notifications selectQuiz() {
        WebElement campoType = navegador.findElement(By.id("quizId"));
        new Select(campoType).selectByVisibleText("Questionário para as notificações");
        return this;
    }

    public Notifications typeLink() {
        navegador.findElement(By.id("externalSiteUrl")).sendKeys("https://statusinvest.com.br/");
        return this;
    }

    public Notifications typeDescription() {
        navegador.findElement(By.id("description")).sendKeys("Hi, i'm SWD");
        return this;
    }

    public Notifications findUserByResgistration() {
        navegador.findElement(By.id("filtroMatricula")).sendKeys("168205817");
        return this;
    }

    public Notifications findUserByName() {
        navegador.findElement(By.id("filtroNome")).sendKeys("JOSEFA");
        return this;
    }

    public Notifications selectState() {
        WebElement campoType = navegador.findElement(By.id("filtroEstado"));
        new Select(campoType).selectByVisibleText("BA");
        return this;
    }

    public Notifications findUsers() {
        findByXPathClick("//button[@ng-click='filterListUsers(1)']");
        return this;
    }

    public Notifications addFoundUsers() {
        findByIdClick("ckb-80d06c4b-01a3-4a08-b1dd-b8403cb3291e");
        findByXPathClick("//button[@ng-click='saveNotificationUsers()']");
        return this;
    }

    public Notifications addUserClinipam() {
        findUserByResgistration();
        findUserByName();
        selectState();
        findUsers();
        addFoundUsers();
        return this;
    }

    public Notifications addUserHomolMeuMedico() {

        return this;
    }

    public Notifications fillAllinNotification(String title,String data, String hour) {
        typeTitle(title);
        typeMessage();
        typeData(data);
        typeHour(hour);
        selectQuiz();
        typeLink();
        typeDescription();
        return this;
    }


}
