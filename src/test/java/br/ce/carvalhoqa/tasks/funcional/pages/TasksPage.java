package br.ce.carvalhoqa.tasks.funcional.pages;

import br.ce.carvalhoqa.tasks.funcional.utilitarios.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TasksPage extends BasePage {
    TasksElements tasksElements;

    public TasksPage(WebDriver navegador) {
        super(navegador);
        tasksElements = new TasksElements();
    }

    public void selecionarAddTodo() {
        navegador.findElement(By.id(tasksElements.getButton_AddTodo_id())).click();
    }

    public String obterMensagemSucesso() {
        String mensagemSucesso = navegador.findElement(By.id(tasksElements.text_Succes_id)).getText();
        return mensagemSucesso;
    }
}