package com.michaelho.easy.to100;

class _0007_ReverseInteger {

    int reverse(int x) {
        if (x == 0) {
            return x;
        }

        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
        long output = 0;

        while (x > 0) {
            output = output*10 + x%10;
            x /= 10;
        }

        output = output*sign;
        return (output > Integer.MAX_VALUE || output < Integer.MIN_VALUE) ? 0 : (int) output;
    }
}