package com.levchenko.hw7.model;

public class NegativeCoef {

    double unHungryCoef;
    double unHappyCoef;
    double sickCoef;

    public double getUnHungryCoef(Pet pet) {
        if (pet.getHungry() < 50) {
            unHungryCoef = 1.5;
        } else {
            unHungryCoef = 1;
        }
        return unHungryCoef;
    }


    public double getUnHappyCoef(Pet pet) {
        if (pet.getHappy() < 10) {
            unHappyCoef = 1.2;
        } else {
            unHappyCoef = 1;
        }
        return unHappyCoef;
    }

    public double getSickCoef(Pet pet) {
        if (pet.isSick()) {
            sickCoef = 2;
        } else {
            sickCoef = 1;
        }
        return sickCoef;
    }
}
