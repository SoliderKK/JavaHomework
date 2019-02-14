package com.homework.lesson2.task2;

public class Node {
    int payload;  //Why final?
    Node next;
    Node(int a) {
        payload = a;
        next = null;
    }
}
