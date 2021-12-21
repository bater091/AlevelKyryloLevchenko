package com.levchenko.hw17.lastTask;

import lombok.Getter;

@Getter
public class Item {
    private String name;
    private final int cost;

    @Override
    public String toString() {
        return "Item{" +
                "cost=" + cost +
                '}';
    }

    public Item(int cost) {
        this.cost = cost;
    }
}
