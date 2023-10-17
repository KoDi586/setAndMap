package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(onlyOddNums(nums));
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
}