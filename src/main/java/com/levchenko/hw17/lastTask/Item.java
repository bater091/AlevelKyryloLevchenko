package com.levchenko.hw17.lastTask;

import lombok.Getter;

@Getter
public class Item {
    private String name;
    private final int cost;

    public Item(int cost) {
        this.cost = cost;
    }
}
