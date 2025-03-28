package com.safavi.todo;

public class TodoValidator {

    public boolean isValid(String todo) {
        if (todo == null || todo.trim().isEmpty()) {
            return false;
        }
        return todo.length() <= 100;
    }


}
