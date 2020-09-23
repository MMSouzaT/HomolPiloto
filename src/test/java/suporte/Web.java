package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome(){
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);//mude para false caso queira que o navegador apareça, true se não quer quer o navegador apareça

        System.setProperty("webdriver.chrome.driver", "C:\\qafullstack\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver(options);
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        navegador.get("aqui vai o link do ambiente a ser testado");
        return navegador;
    }
}
