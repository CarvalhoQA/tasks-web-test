package br.ce.carvalhoqa.tasks.funcional.utilitarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChromeDriver() throws MalformedURLException {

        DesiredCapabilities cap = DesiredCapabilities.chrome();
        WebDriver navegador = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
        navegador.navigate().to("http://localhost:8001/tasks/");
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return navegador;
    }
}