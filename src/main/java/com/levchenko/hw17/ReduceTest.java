package com.levchenko.hw17;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceTest {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10 + 5));


        }
        for (Integer s : list) {
            System.out.print(s + "  ");
        }
        System.out.println();
        Optional<Integer> res = list.stream().
                reduce((a, b) -> a < b ? a : b);
        System.out.println(res.get());
    }

}
