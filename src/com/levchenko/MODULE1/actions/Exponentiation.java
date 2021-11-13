package com.levchenko.MODULE1.actions;

import com.levchenko.MODULE1.model.UserMassive;

import java.util.Arrays;

public class Exponentiation {
    public void ExponentArgs(UserMassive userMassive){
        int pow = 3;
        int[] argsCopy = new int[userMassive.getUserArgs().length];
        argsCopy = Arrays.copyOf(userMassive.getUserArgs(),userMassive.getUserArgs().length);
        for (int i = 2; i < argsCopy.length; i += 3) {
            argsCopy[i] = (int)Math.pow(argsCopy[i],pow);

        }
        userMassive.setUserArgs(argsCopy);
    }
}
