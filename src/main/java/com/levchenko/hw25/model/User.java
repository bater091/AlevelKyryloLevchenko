package com.levchenko.hw25.model;

import lombok.Getter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
@Getter
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(generator = "increment")
    private int id;
    @Column
    private String name;
    @Column
    private Date dateBurn;
    @OneToMany(mappedBy = "user")
    private List<Ticket> ticketList;
}
