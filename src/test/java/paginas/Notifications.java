package paginas;

import org.openqa.selenium.WebDriver;

public class Notifications extends PageBase {
    public Notifications(WebDriver navegador) {
        super(navegador);
    }

    public Notifications newNotification() throws InterruptedException {
        openLateralMenu("//a[@ng-click='notificacoes()']");
        clickButton("//a[@ng-click='CreateNotification()']");
        return this;
    }

    public Notifications editNotification() throws InterruptedException {
        openTypeFilter("//a[@ng-click='notificacoes()']", "//input[@id='title']","//a[@ng-click='filterNotifications(1)']");
        selects("//select[@id='filtroStatus']","Não Enviado");
        clickButton("//a[@ng-click='filterNotifications(1)']");
        waitHalfASecond();
        clickButton("//a[@ng-click='EditNotification(item)']");
        return this;
    }

    public Notifications deleteNotification() throws InterruptedException{
        openTypeFilter("//a[@ng-click='notificacoes()']", "//input[@id='title']","//a[@ng-click='filterNotifications(1)']");
        selects("//select[@id='filtroStatus']","Não Enviado");
        clickButton("//a[@ng-click='filterNotifications(1)']");
        waitHalfASecond();
        clickButton("//a[@ng-click='ConfirmDeleteNotification(item)']");
        clickButton("//a[@ng-click='DeleteNotification()']");
        toastValidation("Notificação deletada com sucesso.");
        return this;
    }

    public Notifications addUser() throws InterruptedException {
        waitHalfASecond();
        type("//input[@id='filtroMatricula']","00992773014"); //altere aqui para alterar o número que você quer a notificação
        type("//input[@id='filtroNome']","Marcio"); //altere aqui pra alterar o nome da pessoa que você quer a notificação
        selects("//select[@id='filtroPerfil']","Selecionar");
        clickButton("//button[@ng-click='filterListUsers(1)']");
        clickButton("//input[@ng-change='addUser(item)']");
        clickButton("//button[@ng-click='saveNotificationUsers()']");
        return this;
    }

    public Notifications writeEverything(String title,String data, String hour) {
        type("//input[@id='form.title']",title);
        type("//input[@id='message']","Message By SWD");
        type("//input[@id='send_date']",data);
        type("//input[@id='send_hour']",hour);
        selects("//select[@id='quizId']","Questionário para as notificações");
        type("//input[@id='externalSiteUrl']","https://statusinvest.com.br/");
        type("//textarea[@id='description']","Desciption By SWD");
        clickButton("//button[@ng-click='salvarNotificacao()']");
        //toastValidation("Cadastro realizado com sucesso");
        return this;
    }

    public Notifications deleteUser(){
        clickButton("//a[@ng-click='ConfirmDeleteUserNotification(item)']");
        clickButton("//a[@ng-click='DeleteNotificationUser()']");
        return this;
    }
}
