package com.levchenko.hw9;

public class Main {
    public static void main(String[] args) {
        Recovery recovery = new Recovery() {
            @Override
            public void reFuel() {
                System.out.println("Success");
            }
        };
        recovery.reFuel();
        Passenger passenger = new Passenger();
        Passenger passenger1 = new Passenger();
        Passenger passenger2 = new Passenger();
        Passenger passenger3 = new Passenger();
        Truck truck = new Truck(001,1999,"BLACK",70);
        PassengerCar passengerCar = new PassengerCar(111, 2002, "RED", 40);
        passengerCar.takePassenger(passenger);
        passengerCar.move();
        passengerCar.stats();

        passengerCar.takePassenger(passenger1);
        passengerCar.move();
        passengerCar.stats();

        passengerCar.takePassenger(passenger2);
        passengerCar.move();
        passengerCar.stats();

        passengerCar.takePassenger(passenger3);
        passengerCar.move();
        passengerCar.reFuel();
        passengerCar.stats();
        truck.stats();
        truck.takeCargo("Box");
        truck.move();
        truck.stats();
        truck.reFuel();
        truck.stats();


    }

}