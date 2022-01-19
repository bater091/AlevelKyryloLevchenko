package com.levchenko.hw25.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Setter
@Getter
@Entity(name = "sessions")
public class Session {
    @Id
    @GeneratedValue(generator = "increment")
    private int id;
    @Column
    private int seatNum;
    @Column
    private int hallNum;
    @ManyToOne
    private Film film;
    @OneToMany(mappedBy = "session")
    private List<Ticket> ticketList;

}
