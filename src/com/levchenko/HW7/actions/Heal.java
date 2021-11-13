package com.levchenko.HW7.actions;

import com.levchenko.HW7.model.Pet;

public class Heal {
    public void petHeal(Pet pet) {
        if (pet.isSick()) {
            pet.setMoney(pet.getMoney() - 50);
            pet.setHappy(10);
            pet.setHungry(70);
            pet.setClear(80);
            pet.setSick(false);
        } else {
            System.out.println("Питомец Здоров");
        }
    }
}
