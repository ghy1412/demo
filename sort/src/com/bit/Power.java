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
}
