package com.michaelho.medium;

import com.michaelho.models.LinkedList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MediumTests1to50 {

    @Test
    public void testAddTwoNumbers() {
        _0002_AddTwoNumbers sol = new _0002_AddTwoNumbers();
        LinkedList linkedList1 = new LinkedList(new int[]{2, 4, 3}), linkedList2 = new LinkedList(new int[]{5, 6, 4});
        LinkedList expected = new LinkedList(new int[]{7, 0, 8});
        assertTrue(expected.equals(sol.addTwoNumbers(linkedList1.head, linkedList2.head)));
    }

    @Test
    public void testLongestPalindromeSubstring() {
        _0005_LongestPalindromeSubstring sol = new _0005_LongestPalindromeSubstring();
        String[] input = new String[] {"babad", "cbbd", "ac", "abcda", "a"};
        String[] expected = new String[] {"bab", "bb", "a", "a", "a"};
        for (int i = 0; i < input.length; i++) {
            assertEquals(expected[i], sol.longestPalindrome(input[i]));
        }
    }

    @Test
    public void testContainerMostWater() {
        _0011_ContainerMostWater sol = new _0011_ContainerMostWater();
        int[] input = new int[] {1,8,6,2,5,4,8,3,7};
        int expected = 49;
        assertEquals(expected, sol.maxArea(input));
    }

    @Test
    public void testIntToRoman() {
        _0012_intToRoman sol = new _0012_intToRoman();
        int[] input = new int[] {3, 4, 9, 58, 1994};
        String[] expected = new String[] {"III", "IV", "IX", "LVIII", "MCMXCIV"};
        for (int i = 0; i < input.length; i++) {
            assertEquals(expected[i], sol.intToRoman(input[i]));
        }
    }

    @Test
    public void testThreeSum() {
        _0015_3Sum sol = new _0015_3Sum();
        int[] input1 = new int[] {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(-4,-2,6));
        expected1.add(Arrays.asList(-4,0,4));
        expected1.add(Arrays.asList(-4,1,3));
        expected1.add(Arrays.asList(-4,2,2));
        expected1.add(Arrays.asList(-2,-2,4));
        expected1.add(Arrays.asList(-2,0,2));
        assertArrayEquals(expected1.toArray(), sol.threeSum(input1).toArray());

        int[] input2 = new int[] {-2,0,1,1,2};
        List<List<Integer>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(-2,0,2));
        expected2.add(Arrays.asList(-2,1,1));
        assertArrayEquals(expected2.toArray(), sol.threeSum(input2).toArray());
    }

    @Test
    public void testThreeSumClosest() {
        _0016_3SumClosest sol = new _0016_3SumClosest();

        // Test 1
        int[] input1 = new int[] {-1, 2, 1, -4};
        int target1 = 1, expected1 = 2;
        assertEquals(expected1, sol.threeSumClosest(input1, target1));

        // Test 2
        int[] input2 = new int[] {1,1,-1,-1,3};
        int target2 = -1, expected2 = -1;
        assertEquals(expected2, sol.threeSumClosest(input2, target2));
    }

    @Test
    public void testLetterCombinations() {
        _0017_LetterCombinationsPhoneNumber sol = new _0017_LetterCombinationsPhoneNumber();
        String input = "23";
        Set<String> expected = Arrays.stream(new String[] {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}).collect(Collectors.toSet());
        assertEquals(expected, Arrays.stream(sol.letterCombinations(input).toArray()).collect(Collectors.toSet()));
    }

    @Test
    public void test4Sum() {
        _0018_4Sum sol = new _0018_4Sum();
        int[] input = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, 0, 0, 1),
                Arrays.asList(-2, -1, 1, 2),
                Arrays.asList(-2,  0, 0, 2)
        );
        List<List<Integer>> output = sol.fourSum(input, target);
        assertTrue(expected.size() == output.size() &&
                expected.containsAll(output) && output.containsAll(expected));
    }
}
