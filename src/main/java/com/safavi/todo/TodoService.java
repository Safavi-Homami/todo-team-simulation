package com.safavi.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

    private final List<String> todos = new ArrayList<>();

    public void addTodo(String todo) {
        todos.add(todo);
    public void removeTodo(String todo) {
        todos.remove(todo);
    }

    public void printTodos() {
        System.out.println("Aktuelle Todos:");
        for (String todo : todos) {
            System.out.println("- " + todo);
        }
    }
}
