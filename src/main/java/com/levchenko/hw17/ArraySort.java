package com.levchenko.hw17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySort {
    static String[] arr = {"test", "sort", "check", "array"};


    public static void main(String[] args) {
        Arrays.stream(arr).
                sorted().
                forEach(System.out::println);


    }

}
