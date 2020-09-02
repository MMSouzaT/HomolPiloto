package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome(){
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);

        System.setProperty("webdriver.chrome.driver", "C:\\qafullstack\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver(options);
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        navegador.get("https://homol.admin.piloto.meumedico.net.br/login");
        return navegador;
    }
}
