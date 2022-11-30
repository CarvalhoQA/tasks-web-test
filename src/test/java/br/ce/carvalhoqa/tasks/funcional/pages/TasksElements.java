package br.ce.carvalhoqa.tasks.funcional.pages;

public class TasksElements {
    protected String button_AddTodo_id;
    protected String text_Succes_id;

    protected TasksElements() {
        button_AddTodo_id = "addTodo";
        text_Succes_id = "message";
    }

    public String getButton_AddTodo_id() {
        return button_AddTodo_id;
    }
    public String getText_Succes_id() {return text_Succes_id;}
}