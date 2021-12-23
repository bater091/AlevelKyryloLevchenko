package com.levchenko.hw17;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class RandomNumbers {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            list.add((int) (Math.random() * 10 - 5));
        }
        System.out.println(list.toString());
        IntSummaryStatistics intSummaryStatistics = list.stream().
                filter(num -> num >= 0).
                collect(IntSummaryStatistics::new,
                        IntSummaryStatistics::accept,
                        IntSummaryStatistics::combine);

        System.out.println();
        System.out.println(intSummaryStatistics.toString());

    }

}
