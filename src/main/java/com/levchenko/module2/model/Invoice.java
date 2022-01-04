package com.levchenko.module2.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Invoice {
    List<Electronics> list;
    Customer customer;
    String type;

    @Override
    public String toString() {
        return "Invoice{" +
                "list=" + list.toString() +
                ", customer=" + customer +
                ", type='" + type + '\'' +
                '}';
    }

    public Invoice(List<Electronics> list, Customer customer, String type) {
        this.list = list;
        this.customer = customer;
        this.type = type;
    }


}
