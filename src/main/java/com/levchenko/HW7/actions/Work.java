package com.levchenko.HW7.actions;

import com.levchenko.HW7.model.NegativeCoef;
import com.levchenko.HW7.model.Pet;

public class Work {
    public void work(Pet pet) {
        NegativeCoef negative = new NegativeCoef();
        if (pet.getAge() >= 5 && pet.getHappy() > 20 && !pet.isSick()) {
            pet.setMoney(pet.getMoney() + (int) (Math.random() * 21 + 5));
            pet.setHungry(pet.getHungry() - 4 * negative.getUnHungryCoef(pet) * negative.getUnHappyCoef(pet) * negative.getSickCoef(pet));
            pet.setHappy(pet.getHappy() - 2 * negative.getUnHungryCoef(pet) * negative.getUnHappyCoef(pet) * negative.getSickCoef(pet));
            if (pet.getWorkCount() == 5) {
                pet.setWorkCount(pet.getWorkCount() + 1);
                pet.setAge(pet.getAge() + 1);
                pet.setWorkCount(0);

            }
            if ((int) (Math.random() * 11) == 0) {
                pet.setSick(true);
            }


        } else {
            System.out.println("Не могу работать");
        }
    }
}
