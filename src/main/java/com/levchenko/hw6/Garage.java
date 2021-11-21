package com.levchenko.hw6;

public class Garage {
    public static void checkCar(Car x) {
        boolean flag = true;
        if (!x.isEnoughPetrolLevel()) {
            System.out.println("not enough petrol");
            flag = false;
        }
        if (x.getEngine().getPower() < 200 && flag) {
            System.out.println("power too low");
            flag = false;
        }
        if (flag) {
            System.out.println("car is ready!");

        }


    }
}