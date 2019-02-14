package com.homework.lesson1.task6;

import java.util.Arrays;

public class Eratosthenes {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sieve(17)));
        System.out.println(Arrays.toString(sieve(1000)));
    }
    public static int[] sieve(int n) {
        boolean[] a = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            a[i] = true;
        }
        int s = n - 1;
        for (int p = 2; 2 * p <= n; p++) {
            if(a[p]) {
                for (int i = 2*p; i <= n; i+=p) {
                    if (a[i]) {
                        a[i] = false;
                        s--;
                    }
                }
            }
        }
        System.out.println(s);
        int[] prime = new int[s];                        //Any other way?
        s = 0;
        for (int i = 2; i <= n; i++) {
            if(a[i]) {
                prime[s] = i;
                s++;
            }
        }
        return prime;
    }
}
