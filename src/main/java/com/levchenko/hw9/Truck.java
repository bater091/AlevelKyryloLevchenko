package com.levchenko.hw9;

import lombok.Getter;
import lombok.ToString;

@Getter
public class Truck extends Car implements Recovery {
    private String cargo;
    private boolean cargoFlag;

    public Truck(int series, int year, String color, int fuel) {
        super(series, year, color, fuel);

    }

    @Override
    void stats() {
        System.out.printf("series: %s year: %s color: %s fuel: %s\n",
                getSeries(), getYear(), getColor(), getFuel());
    }

    void takeCargo(String cargo) {
        cargoFlag = true;
        this.cargo = cargo;

    }

    void takeOffCargo() {
        this.cargo = null;
        cargoFlag = false;
    }

    @Override
    public void move() {
        if (getFuel() > 0 && getFuel() - getFuelCons() >= 0) {
            System.out.println("moving");
            setFuel(getFuel() - getFuelCons() * 2);
        } else {
            System.out.println("no fuel");
        }
    }

    public void reFuel() {
        setFuel(100);
    }


}
