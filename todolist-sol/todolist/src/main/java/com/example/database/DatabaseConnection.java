package com.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.example.config.DataBaseConfig;

public class DatabaseConnection {

    private final DataBaseConfig config;

    public DatabaseConnection(DataBaseConfig config) {
        this.config = config;
    }

    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("MYSQL JDBC Driver tidak ditemukan", e);
        }

        return DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
        );
    }
}

// import com.example.database.DatabaseConnection;
// import com.example.config.MySqlConfig;
// import com.example.dao.TaoDaoJdbl;
// import com.example.model.Todo;
// MySqlconfig mySqlConfig = new MySqlConfig();
// DatabaseConnection dbConnection = new DatabaseConnection(mySqlConfig);

// TodoDaoJdbl todoDaoJdbc = new TodoDaoJdbc(dbConnection);
// Todo todo = new Todo("Belajar Spring Boot", "Ini deskripsi belajar spring Boot");
// todoDaoJdbl.create(todo);