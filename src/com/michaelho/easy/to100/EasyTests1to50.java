package com.michaelho.easy.to100;

import org.junit.Test;

import static org.junit.Assert.*;

public class EasyTests1to50 {

    @Test
    public void testTwoSum() {
        _0001_TwoSum sol = new _0001_TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, sol.twoSum(nums, target));
    }

    @Test
    public void testReverseInteger() {
        _0007_ReverseInteger sol = new _0007_ReverseInteger();

        int[] input = new int[] {123, -123, 120, 1534236469};
        int[] expected = new int[] {321, -321, 21, 0};
        for (int i = 0; i < input.length; i++) {
            assertEquals(expected[i], sol.reverse(input[i]));
        }
    }

    @Test
    public void testValidParentheses() {
        _0020_ValidParentheses sol = new _0020_ValidParentheses();
        String[] input = new String[] {"()", "()[]{}", "(]", "([)]", "{[]}", "]", "["};
        boolean[] expected = new boolean[] {true, true, false, false, true, false, false};
        for (int i = 0; i < input.length; i++) {
            assertEquals(expected[i], sol.isValid(input[i]));
        }
    }
}
