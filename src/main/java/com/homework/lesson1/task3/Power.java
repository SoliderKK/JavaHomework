package com.homework.lesson1.task3;

public class Power {
    public static void main(String[] args) {
        System.out.println(pow(2,5));
        System.out.println(pow(-2,3));
        System.out.println(pow(1,10));
        System.out.println(pow(10,4));
        System.out.println(pow(0, 0));
        System.out.println(pow(1, -1));
    }
    public static long pow (long a, long n) {
        if (n > 0) {
            return a * pow(a, n - 1);
        }
        else if (n == 0) {
            return 1;
        }
        else {
            throw new RuntimeException("n must not be negative");
        }
    }
}
