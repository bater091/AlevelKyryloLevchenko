package com.levchenko.hw12;

public class Second {
    public void g() {
        throw new IllegalArgumentException();
    }

    public void f() {
        try {
            g();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        Second second = new Second();
        second.f();
    }
}
