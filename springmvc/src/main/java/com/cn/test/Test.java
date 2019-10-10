package com.cn.test;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[]{12,32,4,5,68,32423,54,65,75,243,24,34,234,54,64,6456,4};
        quickSort(array, 0, array.length-1);
        print(array);
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void quickSort(int[] array,int low, int high){
        if (low >= high){
            return;
        }
        int part = finPartition(array, low, high);
        quickSort(array, low, part-1);
        quickSort(array,part+1,high);

    }

    private static int finPartition(int[] array, int low, int high) {
        int tmp = array[low];
        while (low < high){
            while (low < high){
                if (array[high] < tmp){
                    array[low] = array[high];
                    break;
                }
                high--;
            }

            while (low < high){
                if (array[low] > tmp){
                    array[high] = array[low];
                    break;
                }
                low++;
            }
        }
        array[low] = tmp;
        return low;
    }
}
