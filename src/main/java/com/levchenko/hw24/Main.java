package com.levchenko.hw24;

import com.levchenko.hw24.hibernateUtil.SessionCreator;
import com.levchenko.hw24.model.Device;
import com.levchenko.hw24.model.Factory;
import com.levchenko.hw24.service.Utils;
import org.hibernate.Session;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Factory factoryFirst = new Factory(1, "QWE");
        final Factory factorySecond = new Factory(2, "ASD");
        final Factory factoryThird = new Factory(3, "ZXC");
        final Factory factoryFourth = new Factory(4, "DFG");
        Session session = SessionCreator.createSession();
        session.beginTransaction();
        session.save(factoryFirst);
        session.save(factorySecond);
        session.save(factoryThird);
        session.save(factoryThird);
        Utils utils = new Utils();
        for (int i = 0; i < 10; i++) {

            session.save(utils.createDevice());
        }
        Device device1 = new Device();
        device1.setFactory(factorySecond);
        device1.setName("test");

        session.save(device1);
        session.getTransaction().commit();
        Device device = new Device();
        device.setDeviceId(1);
        utils.deleteDevice(device);
        device.setDeviceId(2);
        utils.updateDevice(device);
        System.out.println(utils.getDevice(4));


    }

}
