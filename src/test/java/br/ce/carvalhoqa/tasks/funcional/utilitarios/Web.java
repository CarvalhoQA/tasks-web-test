package br.ce.carvalhoqa.tasks.funcional.utilitarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Web {
    static boolean chromedriverlocal = true;

    public static WebDriver createChromeDriver() throws MalformedURLException {
        if (chromedriverlocal) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setHeadless(false);

            WebDriver navegador = new ChromeDriver(chromeOptions);
            navegador.get("http://localhost:8001/tasks");

            return navegador;
        } else {
            ChromeOptions cap = new ChromeOptions();

            WebDriver navegador = new RemoteWebDriver(new URL("http://192.168.1.3:4444"), cap);
            navegador.navigate().to("http://192.168.1.3:8001/tasks");

            return navegador;
        }
    }
}