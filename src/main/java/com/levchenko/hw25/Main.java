package com.levchenko.hw25;

import com.levchenko.hw25.HibernateUtil.CreateSession;
import com.levchenko.hw25.model.Film;
import com.levchenko.hw25.model.Session;
import com.levchenko.hw25.model.Ticket;
import com.levchenko.hw25.model.User;
import com.levchenko.hw25.service.DataBaseUtils;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataBaseUtils dataBaseUtils = new DataBaseUtils();
        List<Ticket> list = new ArrayList<>();


        for (int i = 0; i < 2; i++) {
            dataBaseUtils.addSession(new Session());
            dataBaseUtils.addFilm(new Film());
            dataBaseUtils.addTicket(new Ticket());
            list.add(new Ticket());
            dataBaseUtils.addUser(new User());


        }
        Ticket ticket = new Ticket();
        ticket.setId(1);
        dataBaseUtils.deleteTicket(ticket);
        List<Session> list1 = dataBaseUtils.getAllSessions();
        for (Session session : list1) {
            System.out.println(session);
        }
        List<User> list2 = dataBaseUtils.getAllUsers();
        for (User user : list2) {
            System.out.println(user);
        }
        Film film = dataBaseUtils.getFilm(2);
        System.out.println(film);


    }
}
