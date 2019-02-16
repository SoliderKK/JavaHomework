package com.homework.lesson3.task1;

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
        System.out.println(array.get(5));
        System.out.println(array.get(6));
        System.out.println(array.indexOf(4));
        System.out.println(array.indexOf(-1));
        array.remove(new Integer(3));
        array.remove(4);
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.get(3));
        System.out.println(array.get(4));
    }
}
