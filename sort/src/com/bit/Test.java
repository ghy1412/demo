package com.bit;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = new char[s.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = '0';
        }
         while (Power.increment(chars)) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

    private static void printV(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
    }
}
