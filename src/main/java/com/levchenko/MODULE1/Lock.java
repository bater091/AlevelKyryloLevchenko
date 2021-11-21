package com.levchenko.MODULE1;

import lombok.Getter;

import java.util.Arrays;

public class Lock {
    int[] args;

    public Lock(int[] args) {
        this.args = args;
    }

    public int[] getArgs() {
        int[] argsCopy = new int[args.length];
        argsCopy = Arrays.copyOf(args,args.length);
        return argsCopy;
    }

    @Override
    public String toString() {
        return "Lock{" +
                "args=" + Arrays.toString(args) +
                '}';
    }
}
