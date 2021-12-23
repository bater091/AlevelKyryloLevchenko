package com.levchenko.hw18.servise;

import com.levchenko.hw18.model.Box;
import com.levchenko.hw18.model.Cargo;
import com.levchenko.hw18.model.MaxLiftingCapacity;

public class CreateBoxObj {
    public static Box createNewBoxXml(String[] arr) {
        Cargo cargo = new Cargo(arr[5], arr[6]);
        int value = Integer.parseInt(arr[4]);
        MaxLiftingCapacity maxLiftingCapacity = new MaxLiftingCapacity(arr[2], value);
        return new Box(arr[0], arr[1], arr[3], arr[7], maxLiftingCapacity, cargo);


    }
    public static Box createNewBoxJson(String[] arr) {
        Cargo cargo = new Cargo(arr[5], arr[6]);
        int value = Integer.parseInt(arr[4]);
        MaxLiftingCapacity maxLiftingCapacity = new MaxLiftingCapacity(arr[3], value);
        return new Box(arr[0], arr[1], arr[2], arr[7], maxLiftingCapacity, cargo);


    }


}
