package com.levchenko.hw6;

public class Engine {
    final private int power;
    final private String type;

    public Engine(int power, String type) {
        this.power = power;
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return type;
    }
}