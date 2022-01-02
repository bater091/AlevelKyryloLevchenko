package com.levchenko.module2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class Customer {
    private final int id, age;
    private final String email;

    public Customer(int id, int age, String email) {
        this.id = id;
        this.age = age;
        this.email = email;
    }

}
