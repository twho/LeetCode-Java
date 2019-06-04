package com.michaelho.medium.to100;

/**
 * Convert integer to roman, the integer ranges from 1 to 1-3999.
 * */
class _0012_intToRoman {
    /**
     Roman integers table
     1 : "I"
     5 : "V"
     10 : "X"
     50 : "L"
     100 : "C"
     500 : "D"
     1000 : "M"
     */
    String intToRoman(int num) {
        String thousands = convertToRoman(num/1000, "M", "", "");
        String hundreds = convertToRoman((num%1000)/100, "C", "D", "M");
        String tens = convertToRoman((num%100)/10, "X", "L", "C");
        String ones = convertToRoman((num%10), "I", "V", "X");

        return thousands + hundreds + tens + ones;
    }

    String convertToRoman(int num, String low, String mid, String high) {
        switch (num) {
            case 1:
                return low;
            case 2:
                return low+low;
            case 3:
                return low+low+low;
            case 4:
                return low+mid;
            case 5:
                return mid;
            case 6:
                return mid+low;
            case 7:
                return mid+low+low;
            case 8:
                return mid+low+low+low;
            case 9:
                return low+high;
        }
        return "";
    }
}
