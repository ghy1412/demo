package com.bit;

public class Finder {

    public static int NumberOf1(int value) {
        //数字二进制中一的个数
        int flag = 1;
        int count = 0;
        while (flag != 0) {

            if ((value&flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }

        return count;
    }

    public static int findOf1(int value) {
        //数字二进制中一的个数
        int count = 0;

        while (value != 0) {
            value = value & (value-1);
            count++;
        }
        return count;
    }
}
