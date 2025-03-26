package com.safavi.todo;

public class Main {

    public static void main(String[] args) {
        TodoService service = new TodoService();
        service.addTodo("Pull Request üben");
        service.addTodo("Konflikte lösen");
        service.printTodos();
        System.out.println("Main läuft – removeTodo() ist bereit.");

    }
}
