package com.example;

import com.example.factory.TodoFactory;
import com.example.view.TodoCLI;

public class Main {
    public static void main(String[] args) {
        clearScreen();
        System.out.println("Welcome to Todo List Application");

        try {
            TodoFactory factory = new TodoFactory();
            TodoCLI cli = factory.createTodoCLI();
            cli.start();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
