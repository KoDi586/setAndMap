package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(onlyOddNums(nums));
    }
    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(onlyEvenNums(nums));
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
}