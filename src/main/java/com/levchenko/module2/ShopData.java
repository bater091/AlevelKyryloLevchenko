package com.levchenko.module2;

import com.levchenko.module2.model.Customer;
import com.levchenko.module2.model.Electronics;
import com.levchenko.module2.model.Invoice;

import java.util.*;
import java.util.stream.Collectors;

public class ShopData {
    public static void info(Map<Customer, Invoice> map) {
        System.out.println("Телефоны " + typeCount(map, "Television"));
        System.out.println("Телевизоры " + typeCount(map, "Telephone"));
        System.out.println("Минимальный заказ " + minSum(map));
        System.out.println("Общая сумма заказов " + totalSum(map));
        System.out.println("рознччные заказы " + retailInvoice(map, "retail"));
        System.out.println("Первые 3 чека " + firstThreeInvoices(map));
        lowAgeInvoices(map);
        sorted(map);


    }

    public static int typeCount(Map<Customer, Invoice> map, String type) {
        List<Electronics> list = map.values().stream().
                flatMap(a -> a.getList().stream()).
                filter(a -> a.getType().equals(type)).
                collect(Collectors.toList());
        return list.size();

    }

    public static String minSum(Map<Customer, Invoice> map) {
        Optional<Invoice> invoice = map.values().stream().min(new Comparator<Invoice>() {
            @Override
            public int compare(Invoice o1, Invoice o2) {
                int a = o1.getList().stream().mapToInt(Electronics::getPrice).sum();
                int s = o2.getList().stream().mapToInt(Electronics::getPrice).sum();
                return a - s;
            }
        });

        return invoice.get().getCustomer().toString() + invoice.get().getList().stream().mapToInt(Electronics::getPrice).sum();
    }

    public static int totalSum(Map<Customer, Invoice> map) {
        int result = map.values().stream().
                flatMap(a -> a.getList().stream()).
                mapToInt(Electronics::getPrice).
                sum();
        return result;
    }

    public static int retailInvoice(Map<Customer, Invoice> map, String type) {
        int result = (int) map.values().stream().
                filter(a -> a.getType().equals(type)).
                count();
        return result;
    }

    public static List<Invoice> firstThreeInvoices(Map<Customer, Invoice> map) {
        List<Invoice> list = map.values().stream().
                limit(3).
                collect(Collectors.toList());
        return list;
    }

    public static void lowAgeInvoices(Map<Customer, Invoice> map) {
        map.values().stream().
                filter(a -> a.getCustomer().getAge() < 18).
                peek(a -> a.setType("lowAge")).
                forEach(System.out::println);

    }

    public static void sorted(Map<Customer, Invoice> map) {
        map.values().stream().
                sorted(new Comparator<Invoice>() {
                    @Override
                    public int compare(Invoice o1, Invoice o2) {
                        return o1.getCustomer().getAge() - o2.getCustomer().getAge();
                    }
                }).
                sorted(new Comparator<Invoice>() {
                    @Override
                    public int compare(Invoice o1, Invoice o2) {
                        return o1.getList().size() - o2.getList().size();
                    }
                }).
                sorted(new Comparator<Invoice>() {
                    @Override
                    public int compare(Invoice o1, Invoice o2) {
                        return o1.getList().stream().mapToInt(Electronics::getPrice).sum() - o2.getList().stream().mapToInt(Electronics::getPrice).sum();
                    }
                }).
                forEach(System.out::println);
    }

}
