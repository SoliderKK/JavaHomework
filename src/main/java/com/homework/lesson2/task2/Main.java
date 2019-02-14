package com.homework.lesson2.task2;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        //System.out.println(list.get(3));  //Exception prints weirdly. Why?
        System.out.println(list.toString());
        list.reverse();
        System.out.println(list.toString());



    }
}
