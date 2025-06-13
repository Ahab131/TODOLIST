package com.example.model;

public class Todo {

    private int id;
    private String title;
    private String description;
    private boolean completed;

    public Todo() {

    }

    public Todo(String title, String description, boolean completed) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    // getter setter
    public int getId() {
        return id;
    }

    public int setId(int id) {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String setTitle(String title) {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String setDescription(String description) {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return id + " " + title + " " + description + " " + completed;
    }

}