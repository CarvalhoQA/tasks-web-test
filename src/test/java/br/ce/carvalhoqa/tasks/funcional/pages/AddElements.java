package br.ce.carvalhoqa.tasks.funcional.pages;

public class AddElements {
    protected String input_Task_id;
    protected String input_DueDate_id;
    protected String input_Save_id;
    protected String text_DataInvalida_id;
    protected String text_DataNaoInformada_id;

    protected AddElements(){
        input_Task_id = "task";
        input_DueDate_id = "dueDate";
        input_Save_id = "saveButton";
        text_DataInvalida_id = "message";
        text_DataNaoInformada_id = "message";
    }

    public String getInput_Task_id() {
        return input_Task_id;
    }

    public String getInput_DueDate_id() {
        return input_DueDate_id;
    }

    public String getInput_Save_id() {
        return input_Save_id;
    }

    public String getText_DataInvalida_id() {
        return text_DataInvalida_id;
    }

    public String getText_DataNaoInformada_id() {
        return text_DataNaoInformada_id;
    }
}