package com.levchenko.hw25.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;
@Setter
@Getter

@Entity(name = "films")
public class Film {
    @Id
    @GeneratedValue(generator = "increment")
    private int id;
    @Column
    private String name;
    @Column
    private Date date;
    @OneToMany(mappedBy = "film")
    private List<Session> sessionList;

}
