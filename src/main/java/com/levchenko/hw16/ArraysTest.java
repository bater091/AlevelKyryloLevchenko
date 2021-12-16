package com.levchenko.hw16;

import org.apache.commons.lang3.time.StopWatch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArraysTest {
    final private static Random random = new Random();
    final private static StopWatch stopWatch = new StopWatch();

    public static void arrayAddMillion(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {

            list.add(random.nextInt(100));
        }


    }

    public static int arrayGetMillion(List<Integer> list) {
        int result = 0;
        for (int i = 0; i < 1000000; i++) {
            result = list.get(random.nextInt(1000));

        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        arrayAddMillion(arrayList);
        arrayAddMillion(linkedList);
        stopWatch.start();
        arrayGetMillion(arrayList);
        stopWatch.stop();
        System.out.println("arrayList time = " + stopWatch.getTime());
        stopWatch.reset();
        stopWatch.start();
        arrayGetMillion(linkedList);
        stopWatch.stop();
        System.out.println("arrayList time = " + stopWatch.getTime());


    }
}
