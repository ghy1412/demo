package com.bit;



public class Test {
    public static void main(String[] args) {
        int fibonacci = Fibonacci.fibonacci(1231);
        System.out.println(fibonacci);
    }

    private static void printV(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
    }
}
