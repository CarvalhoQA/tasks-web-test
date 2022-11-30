package br.ce.carvalhoqa.tasks.funcional.utilitarios;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Screenshot {
    public static void capturar(WebDriver navegador, String arquivo){
        File screenshot = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(screenshot, new File(arquivo));
        }catch (Exception ex){
            System.out.println();
        }
    }

    public static String dataHoraParaArquivo(){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("ddMMyyyyhhmmss").format(ts);
    }

    public static String pastaArquivoScreenshot(){
        Path currentRelativePath = Paths.get("");
        String path = currentRelativePath.toAbsolutePath().toString();
        return path +"\\src\\test\\java\\\\br\\ce\\carvalhoqa\\taks\\funcional\\test-report\\";
    }

    public static void capturarScreenShot(WebDriver navegador, String nomeArquivo){
        Screenshot.capturar(navegador,pastaArquivoScreenshot() + dataHoraParaArquivo() + nomeArquivo + ".png");
    }
}