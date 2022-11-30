package br.ce.carvalhoqa.tasks.funcional.utilitarios;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Web {
    public static WebDriver createChromeDriver(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.setHeadless(false);

        WebDriver navegador = new ChromeDriver(chromeOptions);

        navegador.get("http://localhost:8001/tasks/");

        return navegador;
    }
}