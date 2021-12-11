package com.levchenko.hw15;

import com.levchenko.hw15.MyList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(3);
        Box box2 = new Box(0);
        Box box3 = new Box(0);
        Box box4 = new Box(6);
        Box box5 = new Box(7);
        Box box6 = new Box(1);
        BoxVolumeComparator compr = new BoxVolumeComparator();
        TreeSet<Box> treeSet = new TreeSet<Box>(compr);

        treeSet.add(box1);
        treeSet.add(box2);
        treeSet.add(box3);
        treeSet.add(box4);
        treeSet.add(box5);
        treeSet.add(box6);

        for (Box box : treeSet) {
            System.out.println(box);
        }


        List<String> list = new ArrayList<>();
        list.add("etet");
        list.add("etetffd");
        list.add("etesdgt5");
        list.add("et");
        list.add("edgtet");


        Map<Integer, String> map1 = listToMap(list);
        for (Integer integer : map1.keySet()) {
            System.out.println(integer + " " + map1.get(integer));

        }
    }

    public static Map<Integer, String> listToMap(List<String> list) {
        Map<Integer, String> map = new HashMap<>();

        for (String s : list) {
            map.put(s.length(), s);

        }
        return map;

    }


}
