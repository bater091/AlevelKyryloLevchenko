package com.levchenko.module2.service;

import com.levchenko.module2.customExeption.IncorrectLineRead;
import com.levchenko.module2.model.*;
import lombok.Getter;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Logger;


public class ShopService {
    public final static Map<Customer, Invoice> customerInvoices = new HashMap<>();


    public static Invoice createInvoice(Customer customer) throws IOException {
        final ClassLoader loader = Thread.currentThread().getContextClassLoader();
        final InputStream resource = loader.getResourceAsStream("module2.csv");
        int priceSum;

        String line = null;
        String splitLine = ",";
        int count = 0;
        List<Electronics> list = new ArrayList<>();


        try (BufferedReader bf = new BufferedReader(new InputStreamReader(resource))) {

            while ((line = bf.readLine()) != null && count < (int) (Math.random() * 8 + 1)) {
                String[] result = line.split(splitLine);
                try {
                    for (String s : result) {

                        if (s.equals("")) {

                            throw new IncorrectLineRead("Incorrect line", line);
                        }

                    }
                } catch (IncorrectLineRead e) {
                    e.printStackTrace();
                    continue;
                }
                if ((int) (Math.random() * 99 + 1) < 50) {
                    if (result[0].equals("Telephone")) {
                        list.add(new Telephone(result[1], result[4], Integer.parseInt(result[6]), result[1], result[0]));
                    } else {
                        list.add(new Television(result[1], result[4], Integer.parseInt(result[6]), result[5], Integer.parseInt(result[3]), result[0]));
                    }
                    count++;
                }


            }

        } catch (IOException e) {
            e.printStackTrace();

        }


        priceSum = list.stream().
                mapToInt(Electronics::getPrice).
                sum();
        Invoice invoice;


        if (priceSum < UserInput.priceLimit) {
            invoice = new Invoice(list, customer, "retail");
        } else {
            invoice = new Invoice(list, customer, "wholesale");
        }
        customerInvoices.put(customer, invoice);
        return invoice;


    }

    public static void log(Customer customer, Invoice invoice) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("E dd.MM.yyyy hh:mm:ss");
        File log = new File("log.csv");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(log, true))) {
            bufferedWriter.write(format.format(date) + "," + customer.getEmail() + "," + invoice.getType() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        UserInput.chooseLimit();
        Customer customer = PersonService.createCustomer();
        System.out.println(customer.toString());
        Invoice invoice = ShopService.createInvoice(customer);
        System.out.println(invoice.toString());
        Invoice invoice1 = ShopService.createInvoice(customer);
        System.out.println(invoice1.toString());
        Invoice invoice2 = ShopService.createInvoice(customer);
        System.out.println(invoice2.toString());
        Invoice invoice3 = ShopService.createInvoice(customer);
        System.out.println(invoice3.toString());
        ShopService.log(customer, invoice);
        ShopService.log(customer, invoice1);
        ShopService.log(customer, invoice2);

    }
}

