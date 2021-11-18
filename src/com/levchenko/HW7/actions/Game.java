package com.levchenko.HW7.actions;

import com.levchenko.HW7.Main;
import com.levchenko.HW7.model.NegativeCoef;
import com.levchenko.HW7.model.Pet;

public class Game {
    NegativeCoef negative = new NegativeCoef();

    public void playGame(Pet pet) {
        pet.setHungry(pet.getHungry() - 3 * negative.getUnHungryCoef(pet) * negative.getUnHappyCoef(pet) * negative.getSickCoef(pet));
        pet.setHappy(pet.getHappy() + 6);
        pet.setGameCount(pet.getGameCount() + 1);
        if (pet.getGameCount() == 4) {

            pet.setAge(pet.getAge() + 1);
            pet.setGameCount(0);

        }
        pet.setMoney(pet.getMoney() + (int) (Math.random() * 10 + 1));
        if ((int) (Math.random() * 11) == 0) {
            pet.setSick(true);
        }


    }
}
