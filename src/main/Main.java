package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }
    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(onlyOddNums(nums));
    }
    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(onlyEvenNums(nums));
    }

    public static void task3() {
        /*
            я понял слово "уникальные" типо не каждый экземпляр
            нужно вывести, а только не что встречается единожды

            и мне показалось, что это решение наиболее оптимизированное
         */
        String str = "я понял слово я \"уникальные\" типо не не каждый экземпляр";
        List<String> strings = new ArrayList<>(List.of(str.split(" ")));

        System.out.println(rarelylyElements(strings));
    }

    private static String onlyOddNums(List<Integer> nums) {
        List<Integer> integers = new ArrayList<>();
        for (Integer num : nums) {
            if (!(num % 2 == 0)) {
                integers.add(num);
            }
        }
        return integers.toString();
    }

    private static String onlyEvenNums(List<Integer> nums) {
        List<Integer> integers = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                integers.add(num);
            }
        }
        return integers.toString();
    }

    private static String rarelylyElements(List<String> strings) {
        Map<String, Integer> exzemplar = new HashMap<>();
        for (String string : strings) {
            if (exzemplar.containsKey(string)) {
                exzemplar.put(string, exzemplar.get(string)+1);
            } else {
                exzemplar.put(string, 1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : exzemplar.keySet()) {
            if (exzemplar.get(s) == 1) {
                stringBuilder.append(s).append(" ");
            }
        }
        return stringBuilder.toString();
    }
}