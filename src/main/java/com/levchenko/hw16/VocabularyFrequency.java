package com.levchenko.hw16;

import java.util.*;

public class VocabularyFrequency {


    public static Map<String, Integer> CreateVocabularyFrequency(String input) {
        List<String> userInputList = new ArrayList<>(Arrays.asList(input.split(" ")));
        Set<String> userInputSet = new HashSet<>(userInputList);
        Map<String, Integer> tempResult = new HashMap<>();


        int temp;

        for (String s : userInputSet) {
            temp = 0;
            for (String s1 : userInputList) {
                if (s.equals(s1)) {
                    temp++;
                }


            }
            tempResult.put(s, temp);


        }
        List<Map.Entry<String, Integer>> SortedList = new LinkedList<>(tempResult.entrySet());
        SortedList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }


        });
        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : SortedList) {
            result.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<String, Integer> v = VocabularyFrequency.CreateVocabularyFrequency(s);
        for (String s1 : v.keySet()) {
            System.out.println(s1);
        }
    }
}