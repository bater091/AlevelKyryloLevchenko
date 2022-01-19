package com.levchenko.hw25.service;

import com.levchenko.hw25.HibernateUtil.CreateSession;
import com.levchenko.hw25.model.Film;
import com.levchenko.hw25.model.Session;
import com.levchenko.hw25.model.Ticket;
import com.levchenko.hw25.model.User;

import java.util.List;

public class DataBaseUtils {
    public List<Session> getAllSessions(){
        try(org.hibernate.Session session = CreateSession.createSession()){
            return session.createCriteria(Session.class).list();
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
    public List<User> getAllUsers(){
        try(org.hibernate.Session session = CreateSession.createSession()){
            return session.createCriteria(User.class).list();
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
    public Film getFilm(int id){
        try(org.hibernate.Session session = CreateSession.createSession()){
            return  session.load(Film.class,id);
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
    public List<Ticket> getAllUsersTickets(int id){
        try(org.hibernate.Session session = CreateSession.createSession()){
            User user = session.load(User.class,id);
            return user.getTicketList();
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
    public void addSession(Session sessionFilm){
        try(org.hibernate.Session session = CreateSession.createSession()){
            session.save(sessionFilm);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void addUser(User user){
        try(org.hibernate.Session session = CreateSession.createSession()){
            session.save(user);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void addFilm(Film film){
        try(org.hibernate.Session session = CreateSession.createSession()){
            session.save(film);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void addTicket(Ticket ticket){
        try(org.hibernate.Session session = CreateSession.createSession()){
            session.save(ticket);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void deleteTicket(Ticket ticket){
        try(org.hibernate.Session session = CreateSession.createSession()){
            session.delete(ticket);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
