package com.michaelho.medium.to100;

public class _0029_DivideTwoIntegers {

    int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        int result = dividend/divisor;
        result = result > Integer.MAX_VALUE ? Integer.MAX_VALUE : result;
        result = result < Integer.MIN_VALUE ? Integer.MIN_VALUE : result;
        return result;
    }
}
