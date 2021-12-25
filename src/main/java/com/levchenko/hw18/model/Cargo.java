package com.levchenko.hw18.model;

public class Cargo {
    private final String name;
    private final String type;

    public Cargo(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


}
