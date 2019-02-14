package com.homework.lesson1.task1;

public class Average {
    public static void main(String[] args) {
        System.out.println(average(1,10));
        System.out.println(average(10,8));
        System.out.println(average(2000000000, 1000000000));
        System.out.println(average(Integer.MAX_VALUE,Integer.MAX_VALUE));
    }
    public static int average(int a, int b) {
        return a / 2 + b / 2 + (a % 2 + b % 2) / 2;
    }
}
