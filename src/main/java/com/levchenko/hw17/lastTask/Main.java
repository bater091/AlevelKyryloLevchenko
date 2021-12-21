package com.levchenko.hw17.lastTask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Box> list = new ArrayList<>();
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(2));
        itemList.add(new Item(5));
        itemList.add(new Item(6));
        itemList.add(new Item(1));
        itemList.add(new Item(1));
        itemList.add(new Item(1));
        itemList.add(new Item(1));
        itemList.add(new Item(1));


        list.add(new Box(itemList, 5));
        list.add(new Box(itemList, 6));
        list.add(new Box(itemList, 7));
        list.add(new Box(itemList, 10));
        list.add(new Box(itemList, 5));
        list.add(new Box(itemList, 9));
        list.add(new Box(itemList, 3));
        list.add(new Box(itemList, 8));
        list.add(new Box(itemList, 15));
        list.stream()
                .flatMap(s -> s.getArr().stream()).
                sorted(new Comparator<Item>() {
                    @Override
                    public int compare(Item o1, Item o2) {
                        return o1.getCost() - o2.getCost();
                    }
                }).
                forEach(System.out::println);


    }

    public static int limitChoose(List<Box> list) {
        Optional<Integer> min = list.stream().
                map(Box::getSize).
                min(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1.compareTo(o2);
                    }
                });
        Optional<Integer> max = list.stream().
                map(Box::getSize).
                max(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1.compareTo(o2);
                    }
                });

        return (int) (Math.random() * (max.get() - min.get()) + min.get());
    }
}
