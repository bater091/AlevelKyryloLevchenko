package com.levchenko.hw14;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Util<T> implements Multiplier<T> {
    T value;

    public void printHashCode(T e) {
        System.out.println("HashCode: " + e.hashCode());
    }

    public void save(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    @Override
    public <G extends Number> Double[] doubleValueIn(G[] array) {
        Double[] arr = new Double[array.length];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = array[i].doubleValue();

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];

        }

        return arr;
    }

    public <Y extends Number> void sum(Y one, Y two) { // should work only with numbers
        double first = one.doubleValue();
        double second = two.doubleValue();
        System.out.println(first + second);
    }

    public <G extends Number> double sumOfArray(List<G> list) {
        double s = 0.0;
        Double[] arr = new Double[list.size()];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = list.get(i).doubleValue();

        }


        for (int i = 0; i < arr.length; i++) {
            s += arr[i];

        }
        return s;
    }

    public void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}
