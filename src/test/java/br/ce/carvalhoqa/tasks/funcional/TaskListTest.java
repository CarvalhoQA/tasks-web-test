package br.ce.carvalhoqa.tasks.funcional;

import org.openqa.selenium.WebDriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.carvalhoqa.tasks.funcional.pages.AddPage;
import br.ce.carvalhoqa.tasks.funcional.pages.TasksPage;
import br.ce.carvalhoqa.tasks.funcional.utilitarios.Constantes;
import br.ce.carvalhoqa.tasks.funcional.utilitarios.Web;

public class TaskListTest {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChromeDriver();
    }

    @Test
    public void adicionarTask(){
        TasksPage tasksPage = new TasksPage(navegador);
        tasksPage.selecionarAddTodo();

        AddPage addPage = new AddPage(navegador);
        addPage.escreverTask();
        addPage.escreverDueDate();
        addPage.clicarSave();

        Assert.assertEquals(tasksPage.obterMensagemSucesso(), Constantes.MSG_CADASTRO_SUCESSO);
    }

    @Test
    public void adicionarTaskParametroDataInvalido(){
        TasksPage tasksPage = new TasksPage(navegador);
        tasksPage.selecionarAddTodo();

        AddPage addPage = new AddPage(navegador);
        addPage.escreverTask();
        addPage.escreverDueDateInvalida();
        addPage.clicarSave();

        Assert.assertEquals(addPage.obterMensagemDataInvalida(), Constantes.ERRO_MSG_DATA_INVALIDA);
    }

    @Test
    public void adicionarTaskParametroDataNaoInformado(){
        TasksPage tasksPage = new TasksPage(navegador);
        tasksPage.selecionarAddTodo();

        AddPage addPage = new AddPage(navegador);
        addPage.escreverTask();
        addPage.clicarSave();

        Assert.assertEquals(addPage.obterMensagemDataNaoInformada(), Constantes.ERRO_MSG_DATA_NAO_INFORMADA);
    }
}