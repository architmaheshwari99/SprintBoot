package com.mahes.archit.todowebapp.todo;

import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;

@Controller
@SessionAttributes("name")
public class TodoControllerJPA {

    private TODORepository todoRepository;

    public TodoControllerJPA(TODORepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping(value = "list-todos")
    public String listAllTodos(ModelMap model) {
        String username = getLoggedinUsername(model);
        model.put("todos", todoRepository.findByUsername(username));
        return "listTodos";
    }

    private String getLoggedinUsername(ModelMap model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return auth.getName();
    }


    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap model) {
        String username = getLoggedinUsername(model);
        Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
        model.put("todo", todo);
        return "todo";
    }
//
//    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
//    public String addTodos(ModelMap model, @Valid Todo todo, BindingResult result) {
//        if(result.hasErrors()){
//            return "todo";
//        }
//        String username = getLoggedinUsername(model);
//        todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(), false);
//        return "redirect:list-todos";
//    }
//
//
//    @RequestMapping(value = "delete-todo", method=RequestMethod.GET)
//    public String deleteTodo(@RequestParam int id) {
//        todoService.deleteById(id);
//        return "redirect:list-todos";
//    }
//
//    @RequestMapping(value = "update-todo", method=RequestMethod.GET)
//    public String updateTodo(@RequestParam int id, ModelMap model) {
//        Todo todo = todoService.findById(id);
//        model.addAttribute("todo", todo);
//        return "todo";
//    }
//
//    @RequestMapping(value = "update-todo", method = RequestMethod.POST)
//    public String updateTodos(ModelMap model, @Valid Todo todo, BindingResult result) {
//        if(result.hasErrors()){
//            return "todo";
//        }
//        String username = getLoggedinUsername(model);
//        todo.setUsername(username);
//        todoService.updateTodo(todo);
//        return "redirect:list-todos";
//    }
//

}
