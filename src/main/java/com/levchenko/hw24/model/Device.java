package com.levchenko.hw24.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@ToString
@Getter
@Setter
@Entity(name = "devices")
public class Device {
    @Id
    @GeneratedValue(generator = "increment")
    private int deviceId;
    @Column
    private String type;
    @Column
    private String name;
    @Column
    private int price;
    @Column
    Date date;
    @Column
    private String description;
    @Column
    private boolean availability;
    @ManyToOne

    private Factory factory;
    @Column
    private int factoryId;


    public Device(String type, String name, int price, Date date,int factoryId) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.date = date;
        this.factoryId = factoryId;
    }

    public Device(){}
}
