package com.levchenko.HW7.model;

public enum Type {
    Deer("Олень"),
    Lion("Лев"),
    Cat("Кот"),
    Dog("Собака");


    private String name;

    Type(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
