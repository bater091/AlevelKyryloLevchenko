package com.levchenko.hw23.model;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Factory {
    private int factoryId;
    private String name;
    private String country;

    public Factory(int factoryId, String name) {
        this.factoryId = factoryId;
        this.name = name;
    }
}
