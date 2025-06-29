package com.example.factory;

import com.example.config.DataBaseConfig;
import com.example.config.MySqlConfig;
import com.example.dao.TodoDao;
import com.example.dao.TodoDaoJdbc;
import com.example.database.DatabaseConnection;
import com.example.service.TodoService;
import com.example.service.TodoServiceImpl;
import com.example.view.TodoCLI;

public class TodoFactory {
    private final DataBaseConfig dbConfig;
    private final DatabaseConnection dbConnection;

    public TodoFactory() {
        this.dbConfig = new MySqlConfig();
        this.dbConnection = new DatabaseConnection(dbConfig);
    }

    public TodoDao createTodoDao() {
        return new TodoDaoJdbc(dbConnection);
    }

    public TodoService createTodoServices() {
        return new TodoServiceImpl(createTodoDao());
    }

    public TodoCLI createTodoCLI() {
        return new TodoCLI(createTodoServices());
    }
}
