package com.michaelho.medium;

class _0005_LongestPalindromeSubstring {

    String longestPalindrome(String s) {
        int length = s.length();

        while (length > 0) {
            for (int i = 0; i <= s.length()-length; i++) {
                int start = i;
                int end = start + length - 1;
                while (start < end) {
                    if (s.charAt(start) != s.charAt(end)) {
                        break;
                    }
                    start ++;
                    end --;
                }

                if (start >= end) {
                    return s.substring(i, i+length);
                }
            }
            length --;
        }
        return "";
    }
}
