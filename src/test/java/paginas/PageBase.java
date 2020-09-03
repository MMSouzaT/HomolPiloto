package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;


public class PageBase {

    public String swd = "01 - SWD";
    protected WebDriver navegador;

    public PageBase(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void openLateralMenu(String xpath) throws InterruptedException {
        navegador.manage().window().maximize();
        navegador.findElement(By.className("icon-open")).click();
        waitHalfASecond();
        clickButton(xpath);
    }

    public void type(String xpath, String text) {
        navegador.findElement(By.xpath(xpath)).sendKeys(text);
    }

    public void clickButton(String xpath) {
        navegador.findElement(By.xpath(xpath)).click();
    }

    public void selects(String xpath, String text) {
        WebElement campoType = navegador.findElement(By.xpath(xpath));
        new Select(campoType).selectByVisibleText(text);
    }

    public void waitHalfASecond() throws InterruptedException {
        Thread.sleep(500);
    }

    public PageBase makeLogin() {
        type("//input[@id='matriculaSms']", "00888888888");
        type("//input[@id='senha']", "3322");
        clickButton("//button[@ng-click='login()']");
        return new PageBase(navegador);
    }

    public PageBase toastValidation(String mensagem) {
        String capturedMessage = navegador.findElement(By.className("toast-message")).getText();
        assertEquals(mensagem, capturedMessage);
        return this;
    }

    public void openTypeFilter(String lateralMenu, String xpath, String button) throws InterruptedException {
        openLateralMenu(lateralMenu);
        waitHalfASecond();
        type(xpath, swd);
        clickButton(button);
        waitHalfASecond();
    }

}
