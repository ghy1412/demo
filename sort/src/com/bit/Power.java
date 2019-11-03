package com.bit;

public class Power {

    public static double power(double base, int exponent) {
        if (base == 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        int unsigned = exponent;

        if (unsigned < 0) {
            unsigned = Math.abs(exponent);
        }
        double result = powerValue(base, unsigned);

        if (exponent < 0) {
            result = 1.0/result;
        }

        return result;
    }

    private static double powerValue(double base, int unsigned) {
        //采用递归的方式减少计算量 16 = 4 * 4
        if (unsigned == 0) {
            return 1;
        }

        if (unsigned == 1) {
            return base;
        }

        double result = powerValue(base, unsigned >> 1);

        if ((unsigned & 1) == 1) {
            result *= base;
        }
        return result;
    }

    //每次加一 这个是从n 打印到  "n位" 数字的最大值 比如输入3 输出 1, 2, 3,... 到 999
    public static boolean increment(char[] chars) {
        boolean isOverflow = true;
        int overNumber = 0;
        int length = chars.length;



          for (int i = length-1; i >= 0; i--) {
            //先拿到最后一位的数
            int number = (chars[i] - '0') + overNumber;
            if (i == length-1) {
                number++;
            }
            if (number >= 10) {
                if (i == 0) {
                    isOverflow = false;
                } else {
                    number = number - 10;
                    overNumber = 1;
                    chars[i] = (char)(number + '0');
                }
            } else {
                chars[i] = (char) (number + '0');
                break;
            }
        }
        return isOverflow;
    }
}
