package com.levchenko.hw6;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        car1.setPetrol(30);
        car2.setPetrol(60);
        car3.setPetrol(100);

        car1.setColour("RED");
        car2.setColour("WHITE");
        car3.setColour("BLACK");

        Engine engine1 = new Engine(250, "V8");
        Engine engine2 = new Engine(150, "V4");
        Engine engine3 = new Engine(500, "UV10");

        car1.setEngine(engine1);
        car2.setEngine(engine2);
        car3.setEngine(engine3);

        car1.setManufacture(Manufacture.BMW);
        car2.setManufacture(Manufacture.KIA);
        car3.setManufacture(Manufacture.Volvo);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        Garage.checkCar(car1);
        Garage.checkCar(car2);
        Garage.checkCar(car3);

    }
}