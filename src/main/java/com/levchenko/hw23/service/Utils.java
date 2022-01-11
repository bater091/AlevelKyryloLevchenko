package com.levchenko.hw23.service;

import com.levchenko.hw23.model.Device;
import com.levchenko.hw23.model.Factory;
import com.levchenko.hw23.model.FactoryStats;

import java.math.BigInteger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {
    private final Random random = new Random();


    public Device createDevice() {

        return new Device(new BigInteger(25, random).toString(32),
                new BigInteger(25, random).toString(32),
                random.nextInt(100),
                new Date(new java.util.Date().getTime()),
                random.nextInt(4) + 1);


    }

    public void addFactory(Factory factory) {
        String SQL = "INSERT INTO factories (ID, name) VALUES(?,?)";
        try (Connection connection = CreateConnection.createConnection()) {
            PreparedStatement statement = connection.prepareStatement(SQL);
            statement.setInt(1, factory.getFactoryId());
            statement.setString(2, factory.getName());
            statement.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public void addDevice(Device device) {
        String SQL = "INSERT INTO devices (type, name, price, date, factoryId) VALUES(?,?,?,?,?)";
        try (Connection connection = CreateConnection.createConnection()) {
            PreparedStatement statement = connection.prepareStatement(SQL);
            statement.setString(1, device.getType());
            statement.setString(2, device.getName());
            statement.setInt(3, device.getPrice());
            statement.setDate(4, device.getDate());
            statement.setInt(5, device.getFactoryId());
            statement.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public Device getDeviceAndFactory(int id) {
        String SQL = "SELECT * FROM devices WHERE ID = ?";
        String SQLFactory = "SELECT * FROM factories WHERE ID = ?";
        Device device = null;
        Factory factory = null;
        try (Connection connection = CreateConnection.createConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {

                if (resultSet.next()) {
                    device = new Device(
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getInt(4),
                            resultSet.getDate(5),
                            resultSet.getInt(8)
                    );
                    device.setDeviceId(resultSet.getInt(1));
                }


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (Connection connection = CreateConnection.createConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLFactory);
            preparedStatement.setInt(1, device.getFactoryId());
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    factory = new Factory(
                            resultSet.getInt(1),
                            resultSet.getString(2));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        device.setFactory(factory);

        return device;
    }

    public void updateDevice(int id, String type, String name, int price, Date date, int factoryId) {
        String SQL = "UPDATE devices SET type = ? , name = ?,price =?,date = ?,factoryId = ? WHERE ID = ? ";

        try (Connection connection = CreateConnection.createConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(6, id);
            preparedStatement.setString(1, type);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, price);
            preparedStatement.setDate(4, date);
            preparedStatement.setInt(5, factoryId);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteDevice(int id) {
        String SQL = "DELETE FROM devices WHERE ID = ?";
        try (Connection connection = CreateConnection.createConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Device> sameFactoryDevices(int factoryId) {
        String SQL = "SELECT * FROM devices   JOIN factories ON factories.ID = devices.factoryId WHERE factories.ID = ? ";
        List<Device> list = new ArrayList<>();
        try (Connection connection = CreateConnection.createConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, factoryId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Device device = new Device(
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getInt(4),
                            resultSet.getDate(5),
                            resultSet.getInt(8)
                    );
                    device.setDeviceId(resultSet.getInt(1));
                    list.add(device);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    public List<FactoryStats> getFactoryStats() {
        String SQL = "SELECT COUNT(ID),SUM(price) ,factoryId FROM devices GROUP BY factoryId";
        List<FactoryStats> list = new ArrayList<>();
        try (Connection connection = CreateConnection.createConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    FactoryStats factoryStats = new FactoryStats(
                            resultSet.getInt(3),
                            resultSet.getInt(1),
                            resultSet.getInt(2)
                    );
                    list.add(factoryStats);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }


}

