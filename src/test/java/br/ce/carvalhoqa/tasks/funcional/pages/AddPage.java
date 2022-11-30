package br.ce.carvalhoqa.tasks.funcional.pages;

import br.ce.carvalhoqa.tasks.funcional.dados.DadosTask;
import br.ce.carvalhoqa.tasks.funcional.utilitarios.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AddPage extends BasePage {
    AddElements addElements;
    DadosTask dadosTask;

    public AddPage(WebDriver navegador) {
        super(navegador);
        addElements = new AddElements();
        dadosTask = new DadosTask();
    }

    public void escreverTask(){
        navegador.findElement(By.id(addElements.getInput_Task_id())).sendKeys(dadosTask.getDescricaoTask());
    }

    public void escreverDueDate(){
        LocalDate data = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        navegador.findElement(By.id(addElements.getInput_DueDate_id())).sendKeys(data.plusDays(7).format(formatter));
    }

    public void escreverDueDateInvalida(){
        LocalDate data = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        navegador.findElement(By.id(addElements.getInput_DueDate_id())).sendKeys(data.minusDays(7).format(formatter));
    }

    public void clicarSave(){
        navegador.findElement(By.id(addElements.getInput_Save_id())).click();
    }

    public String obterMensagemDataInvalida() {
        String mensagemDataInvalida = navegador.findElement(By.id(addElements.getText_DataInvalida_id())).getText();
        return mensagemDataInvalida;
    }

    public String obterMensagemDataNaoInformada() {
        String mensagemDataNaoInformada = navegador.findElement(By.id(addElements.getText_DataNaoInformada_id())).getText();
        return mensagemDataNaoInformada;
    }
}