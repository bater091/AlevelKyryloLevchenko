package com.levchenko.hw18.model;

public class MaxLiftingCapacity {
    private final String unit;
    private final int value;

    public MaxLiftingCapacity(String unit, int value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "MaxLiftingCapacity{" +
                "unit='" + unit + '\'' +
                ", value=" + value +
                '}';
    }


}
