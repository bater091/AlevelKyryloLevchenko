package com.levchenko.module1.actions;

import com.levchenko.module1.model.UserMassive;

public class SetMassive {
    public void randomNumbs(UserMassive userMassive){
        int[] argsCopy = new int[userMassive.getUserArgs().length];
        for (int i = 0; i < argsCopy.length; i++) {
            argsCopy[i] = (int)(Math.random() * 201 - 100);

        }
        userMassive.setUserArgs(argsCopy);
    }
}
