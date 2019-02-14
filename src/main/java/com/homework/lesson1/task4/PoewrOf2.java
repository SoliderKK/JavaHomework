package com.homework.lesson1.task4;

public class PoewrOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOf2(24));
        System.out.println(isPowerOf2(32));
        System.out.println(isPowerOf2(1024));
        System.out.println(isPowerOf2(1));
    }
    public static boolean isPowerOf2 (int a) {
        if (a <= 0) {
            return false;
        }
        else if (a % 2 == 0) {
            if (a == 2) {
                return true;
            }
            else {
                return isPowerOf2(a / 2);
            }
        }
        else {
            return false;
        }
    }
}
//or it's possible to use log2 and check if the result is integer
