package com.levchenko.hw25.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateSession {
    public static Session createSession() {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = null;
        sessionFactory = configuration.buildSessionFactory();

        return sessionFactory.openSession();

    }
}
