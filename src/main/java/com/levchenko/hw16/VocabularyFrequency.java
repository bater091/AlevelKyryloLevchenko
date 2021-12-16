package com.levchenko.hw16;

import java.util.*;

public class VocabularyFrequency {


    public Map<String, Integer> CreateVocabularyFrequency(String input) {
        List<String> list = new ArrayList<>(Arrays.asList(input.split(" ")));
        Set<String> set = new HashSet<>(list);
        Map<String, Integer> result = new TreeMap<>();


        int temp;

        for (String s : set) {
            temp = 0;
            for (String s1 : list) {
                if (s.equals(s1)) {
                    temp++;
                }


            }
            result.put(s, temp);


        }





        return result;
    }


}
