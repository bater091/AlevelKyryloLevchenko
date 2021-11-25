package com.levchenko.hw9;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Car {
    private int series;
    private int year;
    private String color;
    private int fuel;
    private int fuelCons;

    public void move() {
        if (fuel > 0) {
            System.out.println("moving");
            fuel -= fuelCons;
        } else {
            System.out.println("no fuel");
        }
    }

    abstract void stats();

    public Car(int series, int year, String color, int fuel) {
        this.series = series;
        this.year = year;
        this.color = color;
        this.fuel = fuel;
        this.fuelCons = 1;
    }

}
