package com.michaelho.leetcode50;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Tests5 {
    Solutions5 solutions5 = new Solutions5();

    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solutions5.twoSum(nums, target));
    }
}
