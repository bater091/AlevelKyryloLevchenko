package com.levchenko.hw23.model;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class FactoryStats {
    private int factoryId;
    private int devicesCount;
    private int devicesSum;

    public FactoryStats(int factoryId, int devicesCount, int devicesSum) {
        this.factoryId = factoryId;
        this.devicesCount = devicesCount;
        this.devicesSum = devicesSum;
    }
}
