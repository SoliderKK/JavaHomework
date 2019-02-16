package com.homework.lesson2;

import java.util.Arrays;
import java.util.HashSet;

public class task3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findPair(new int[]{1, 5, 2, 7}, new int[]{2, 3, 7, -3}, 5)));
    }

    public static int[] findPair(int[] a, int[] b, int x) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (set.contains(x - b[i])) {
                return new int[]{x - b[i], b[i]};
            }
        }
        return new int[]{};
    }
}
