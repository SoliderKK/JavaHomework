package com.homework.lesson2.task2;

public class LinkList {
    Node head;
    public LinkList(){
        head = null;
    }
    public void add(int a) {
        if (head == null) {
            head = new Node(a);
        }
        else {
            Node pointer = head;
            while (true) {
                if (pointer.next == null) {
                    pointer.next = new Node(a);
                    break;
                } else {
                    pointer = pointer.next;
                }
            }
        }
    }
    public int get (int index) {
        Node pointer = head;
        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
            if (pointer == null) {
                throw new IndexOutOfBoundsException();
            }
        }
        return pointer.payload;
    }
    public String toString () {
        String s = new String();                 // What's this warning?
        if (head == null) {
            return "";
        }
        Node pointer = head;
        while(pointer != null) {
            s = s.concat(String.valueOf(pointer.payload));
            pointer = pointer.next;
        }
        return s;
    }
    public void reverse () {
        Node pointer = head;
        Node temp = null;
        Node prev = null;
        while (pointer != null) {
            temp = pointer.next;
            pointer.next = prev;
            prev = pointer;
            pointer = temp;
        }
        head = prev;
    }
}
