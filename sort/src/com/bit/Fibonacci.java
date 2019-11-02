package com.bit;

public class Fibonacci {

    public static int fibonacci(int v) {
        int a = 1;
        int b = 1;
        int c = 2;
        int i = 3;
        if (v <= 2) {
            return 1;
        }
        while (i <= v) {
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        return c;
    }
}
