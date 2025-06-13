package com.example.config;

import com.example.config.DataBaseConfig;

public class MySqlConfig implements DataBaseConfig {

    @Override
    public String getUrl() {
        return "jdbc:mysql://localhost:3306/todolist";
    }

    @Override
    public String getUsername() {
        return "root";
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getDriverClassName() {
        return "com.myswl.cj.jdbc.Driver";
    }

}