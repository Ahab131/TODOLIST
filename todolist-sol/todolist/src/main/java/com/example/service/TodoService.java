package com.example.service;

import java.util.List;
import com.example.model.Todo;

public interface TodoService {

    void addTodo(String title, String description) throws Exception;

    void updateTodo(Todo todo) throws Exception;

    void deleteTodo(int id) throws Exception;

    Todo getTodoById(int id) throws Exception;

    List<Todo> getAllToDos() throws Exception;

    void markAsCompleted(int id) throws Exception;

}
