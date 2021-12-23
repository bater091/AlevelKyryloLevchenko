package com.levchenko.hw17.lastTask;

import lombok.Getter;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Getter
public class Box {
    private List<Item> arr;
    private int size;

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                '}';
    }

    public Box(List<Item> arr, int size) {
        this.arr = arr;
        this.size = size;
    }
}
