package com.mahes.archit.todowebapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
    private static List<Todo> todos;
    static {
        todos.add(new Todo(1, "in28mins", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "in29mins", "Learn Azure", LocalDate.now().plusYears(2), true));
        todos.add(new Todo(3, "in30mins", "Learn GCP", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
