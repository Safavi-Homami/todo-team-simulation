package com.safavi.todo;
import java.util.ArrayList;
import java.util.List;

public class TodoService {

    private final List<String> todos = new ArrayList<>();

    public void removeTodo(String todo) {
        todos.remove(todo);
    }

}
