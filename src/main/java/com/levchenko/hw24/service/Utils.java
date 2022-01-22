package com.levchenko.hw24.service;

import com.levchenko.hw24.hibernateUtil.SessionCreator;
import com.levchenko.hw24.model.Device;
import com.levchenko.hw24.model.Factory;
import org.hibernate.Session;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;
import java.util.Random;

public class Utils {
    Random random = new Random();

    public com.levchenko.hw24.model.Device createDevice() {

        return new com.levchenko.hw24.model.Device(new BigInteger(25, random).toString(32),
                new BigInteger(25, random).toString(32),
                random.nextInt(100),
                new Date(new java.util.Date().getTime()),
                random.nextInt(4) + 1);


    }

    public com.levchenko.hw24.model.Device getDevice(int id) {
        try (org.hibernate.Session session = SessionCreator.createSession()) {
            return session.load(com.levchenko.hw24.model.Device.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateDevice(com.levchenko.hw24.model.Device device ) {
        try (org.hibernate.Session session = SessionCreator.createSession()) {
            session.update(device);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public void deleteDevice(Device device){
        try(org.hibernate.Session session = SessionCreator.createSession()){
           session.beginTransaction();
            session.delete(device);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public List<com.levchenko.hw24.model.Device> getFactoriesDevices(int id) {
        try (org.hibernate.Session session = SessionCreator.createSession()) {
            session.beginTransaction();
            Factory factory = session.load(Factory.class,id);
            session.getTransaction().commit();
            return factory.getDeviceList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List getFactoriesStats() {
        try (Session session = SessionCreator.createSession()) {
            session.beginTransaction();
            List query = session.createQuery ("SELECT COUNT(deviceId),SUM(price) ,factoryId FROM devices GROUP BY factoryId").list();
            session.getTransaction().commit();
            return query;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}