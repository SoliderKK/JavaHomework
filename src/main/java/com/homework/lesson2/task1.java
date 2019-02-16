package com.homework.lesson2;

public class task1 {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5}, 6));
        System.out.println(binarySearch(new int[]{5, 10, 18, 24, 55, 65}, 65));
    }

    static int binarySearch(int[] array, int x) {
        int a = 0;
        int b = array.length - 1;
        while (true) {
            int i = (a + b) / 2;
            if (array[i] <= x) {
                if (array[i] == x) {
                    return i;
                }
                if (a == b) {
                    return -1;
                }
                a = i + 1;
            } else {
                if (a == b) {
                    return -1;
                }
                b = i - 1;
            }
        }
    }
}
