package paginas;

import org.openqa.selenium.WebDriver;

public class WaitingRoom extends PageBase{
    public WaitingRoom(WebDriver navegador) {
        super(navegador);
    }

    public WaitingRoom newWaitingRoom() throws InterruptedException {
        openLateralMenu("//a[@ng-click='unidades()']");
        clickButton("//button[@ng-click='registerUnity()']");
        return this;
    }

    public WaitingRoom writeEverything(){

        return this;
    }
}
