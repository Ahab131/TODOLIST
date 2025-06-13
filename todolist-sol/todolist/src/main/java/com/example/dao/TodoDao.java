package com.example.dao;

// import java.util.List;
// import com.example.model.Todo;

// menerapkan OCP Principle
// interface ini memnungkinkan untuk ekstensi tanpa modifikasi

public interface TodoDao extends TodoReader, TodoWriter{
    // void create(Todo todo) throws Exception;

    // void update(Todo todo) throws Exception;

    // void delete(int id) throws Exception;

    // Todo findById(int id) throws Exception;

    // List<Todo> findAll() throws Exception;

}
