package com.levchenko.hw12;

public class First {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException("Test");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());

        } finally {
            System.out.println("finally block");
        }
    }
}

