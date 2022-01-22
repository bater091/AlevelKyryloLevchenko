package com.levchenko.hw24.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@ToString
@Getter
@Entity(name = "factories")
public class Factory {
    @Id
    @GeneratedValue(generator = "increment")
    private int factoryId;
    @Column
    private String name;
    @Column
    private String country;
@OneToMany
List<Device> deviceList;

    public Factory(int factoryId, String name) {
        this.factoryId = factoryId;
        this.name = name;

    }
    public Factory(){}
}
