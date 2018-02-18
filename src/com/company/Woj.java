package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Woj {
    public static void main(String[] args) {
        int[] values = new int[3];

        for (int n = 0; n<values.length; n++) {
            values[n] = ThreadLocalRandom.current().nextInt(-99999, 99999999);
        }
        for (int n : values) {
            System.out.println(n);
        }
    }
}
