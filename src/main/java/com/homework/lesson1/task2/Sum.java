package com.homework.lesson1.task2;

import java.math.BigDecimal;

public class Sum {
    public static void main(String[] args) {
        float xf = 0.1F;
        float sumf = 0;
        for (int i = 0; i < 10000; i++) {
            sumf += xf;
        }
        System.out.println("float - " + sumf);
        double xd = 0.1;
        double sumd = 0;
        for (int i = 0; i < 10000; i++) {
            sumd += xd;
        }
        System.out.println("double - " + sumd);
        BigDecimal xb1 = new BigDecimal(0.1);
        BigDecimal sumb1 = new BigDecimal(0);
        for (int i = 0; i < 10000; i++) {
            sumb1 = sumb1.add(xb1);
        }
        System.out.println("BigDecimal - " + sumb1);
        BigDecimal xb2 = new BigDecimal(0.1).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal sumb2 = new BigDecimal(0);
        for (int i = 0; i < 10000; i++) {
            sumb2 = sumb2.add(xb2);
        }
        System.out.println("BigDecimal with rounding - " + sumb2);
    }
}
