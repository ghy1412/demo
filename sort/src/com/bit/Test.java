package com.bit;



public class Test {
    public static void main(String[] args) {
        int[] array = new int[]{1, 21, 4, 0, 32, 0, -1, 0, 4,123,123,123,12343,435,3451,231,123,1,43,23,1};
/*        Sort.quickSort(array, 0, array.length-1);
        printV(array);*/
        Sort.heapSort(array);
        printV(array);
    }

    private static void printV(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
    }
}
