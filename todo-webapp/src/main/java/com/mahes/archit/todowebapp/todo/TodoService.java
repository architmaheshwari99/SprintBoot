package com.mahes.archit.todowebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    private static int todoCount=0;

    static {
        todos.add(new Todo(todoCount++, "in28mins", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(todoCount++, "in29mins", "Learn Azure", LocalDate.now().plusYears(2), true));
        todos.add(new Todo(todoCount++, "in30mins", "Learn GCP", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean isDone){
        Todo todo = new Todo(todoCount++ ,username, description, targetDate, isDone);
        todos.add(todo);
    }
}
