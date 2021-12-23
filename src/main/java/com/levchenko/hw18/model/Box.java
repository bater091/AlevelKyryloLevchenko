package com.levchenko.hw18.model;

import lombok.Setter;


public class Box {
    private final String from, material, color, data;
    private final MaxLiftingCapacity maxLiftingCapacity;
    private final Cargo cargo;

    public Box(String from, String material, String color, String data, MaxLiftingCapacity maxLiftingCapacity, Cargo cargo) {
        this.from = from;
        this.material = material;
        this.color = color;
        this.data = data;
        this.maxLiftingCapacity = maxLiftingCapacity;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Box{" +
                "from='" + from + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", data='" + data + '\'' +
                ", maxLiftingCapacity=" + maxLiftingCapacity +
                ", cargo=" + cargo +
                '}';
    }
}
