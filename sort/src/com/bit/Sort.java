package com.bit;

public class Sort {
    public static void quickSort(int[] array,int start, int end){
        if (start >= end) {
            return;
        }
        int part = partition(array, start, end);
        quickSort(array, start, part-1);
        quickSort(array, part+1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int value = array[start];

        int i = start;
        int j = end;

        while (i < j) {

            while (i < j && array[j] >= value) {
                j--;
            }

            while (i < j && array[i] <= value) {
                i++;
            }
            if (i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }

        array[start] = array[i];
        array[i] = value;

        return i;
    }


    public static void heapSort(int[] array) {
        int length = array.length;
        int sp = (length-2)/2;

        for (int i = sp; i >= 0; i--) {
            heapify(array,i, array.length);
        }

        int j = array.length-1;

        while (j > 0) {
            int tmp = array[0];
            array[0] = array[j];
            array[j] = tmp;
            heapify(array, 0, j);
            j--;
        }
    }

    private static void heapify(int[] array, int sp, int length) {

        int max = sp*2 + 1;
        if (max > length-1) {
            return;
        }
        //判断有无右孩子
        if (max+1 < length && array[max+1] > array[max]) {
            max = max+1;
        }

        if (array[sp] >= array[max]) {
            return;
        }

        int tmp = array[sp];
        array[sp] = array[max];
        array[max] = tmp;
        heapify(array, max, length);
    }
}
