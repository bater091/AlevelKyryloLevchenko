package com.levchenko.hw9;

public class PassengerCar extends Car implements Recovery {
    private Passenger passenger;
    int passengerCount;

    public PassengerCar(int series, int year, String color, int fuel) {
        super(series, year, color, fuel);
    }

    @Override
    void stats() {
        System.out.printf("series: %s year: %s color: %s fuel: %s passenger: %s\n",
                getSeries(), getYear(), getColor(), getFuel(), passengerCount);
    }

    void takePassenger(Passenger passenger) {
        if (passengerCount < 3) {
            System.out.println("passenger took");
            passengerCount++;
            passenger.setSeatFlag(true);
        } else {
            System.out.println("no seats");
        }

    }

    public void reFuel() {
        setFuel(100);
    }

}
