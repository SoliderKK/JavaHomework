package com.homework.lesson3.task1and2;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> array = new MyArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        for (int e : array) {
            System.out.print(e);
        }
        System.out.println();
        System.out.println(array.indexOf(4));
        System.out.println(array.indexOf(-1));
        array.remove(new Integer(3));
        array.remove(4);
        for (int e : array) {
            System.out.print(e);
        }
    }
}
