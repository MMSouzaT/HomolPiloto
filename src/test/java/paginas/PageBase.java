package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;


public class PageBase {

    protected WebDriver navegador;

    public PageBase(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void openLateralMenu(String xpath) {
        navegador.findElement(By.className("icon-open")).click();
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

    public PageBase findByLinkTextClick(String linkTextClick) {
        navegador.findElement(By.linkText(linkTextClick)).click();
        return this;
    }

    public PageBase findByIdClick(String idClick) {
        navegador.findElement(By.id(idClick)).click();
        return this;
    }

    public PageBase findByXPathClick(String xpathClick) {
        navegador.findElement(By.xpath(xpathClick)).click();
        return this;
    }

    public PageBase toastValidation(String mensagem) {
        String capturedMessage = navegador.findElement(By.className("toast-message")).getText();
        assertEquals(mensagem, capturedMessage);
        return this;
    }

}
