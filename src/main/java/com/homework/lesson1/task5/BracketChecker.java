package com.homework.lesson1.task5;

public class BracketChecker {
    public static void main(String[] args) {
        System.out.println(check("()"));
        System.out.println(check("(()"));
        System.out.println(check("())"));
        System.out.println(check("(()(()()))"));
    }
    public static boolean check (String s) {
        int a = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                a++;
            }
            else if (c == ')') {
                a--;
                if (a < 0) {
                    return false;
                }
            }
            else {
                throw new RuntimeException("incorrect string");
            }
        }
        return a == 0;
    }
}
