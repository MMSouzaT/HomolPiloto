package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBase {

    protected WebDriver navegador;

    public PageBase(WebDriver navegador) {
        this.navegador = navegador;
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

}
