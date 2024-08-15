package com.todo.controller;

import com.todo.model.TodoItem;
import com.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "*")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<TodoItem> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public Optional<TodoItem> getTodoById(@PathVariable Long id) {
        return todoService.getTodoById(id);
    }

    @PostMapping
    public TodoItem createTodo(@RequestBody TodoItem todo) {
        return todoService.createTodo(todo);
    }

    @PutMapping("/{id}")
    public TodoItem updateTodo(@PathVariable Long id, @RequestBody TodoItem todo) {
        return todoService.updateTodo(id, todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable Long id) {
        todoService.deleteTodoById(id);
    }
}
