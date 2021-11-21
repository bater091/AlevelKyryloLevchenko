package com.levchenko.hw7.actions;

import com.levchenko.hw7.model.NegativeCoef;
import com.levchenko.hw7.model.Pet;

public class Feed {
    public void actionsFeed(Pet pet, NegativeCoef negative) {
        pet.setHungry(pet.getHungry() + 5);
        pet.setClear(pet.getClear() - 2 * negative.getUnHungryCoef(pet) * negative.getUnHappyCoef(pet) * negative.getSickCoef(pet));


    }
}
