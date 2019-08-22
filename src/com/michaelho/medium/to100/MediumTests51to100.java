package com.michaelho.medium.to100;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MediumTests51to100 {

    @Test
    public void testAddTwoNumbers() {
        _0063_UniquePaths sol = new _0063_UniquePaths();
        int[] input = new int[] {3, 2};
        int expected = 3;
        assertEquals(expected, sol.uniquePaths(input[0], input[1]));
    }
}
