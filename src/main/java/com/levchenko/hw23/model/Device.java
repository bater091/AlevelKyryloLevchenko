package com.levchenko.hw23.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@ToString
@Getter
@Setter
public class Device {
    private int deviceId;
    private String type;
    private String name;
    private int price;
    Date date;
    private String description;
    private boolean availability;
    private Factory factory;
    private int factoryId;

    public Device(String type, String name, int price, Date date, int factoryId) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.date = date;
        this.factoryId = factoryId;
    }
}
