package com.michaelho.medium.to100;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode: https://leetcode.com/problems/generate-parentheses/
 * */
class _0022_GenerateParentheses {

    List<String> generateParenthesis(int n) {
        List<String> output = new ArrayList<>();
        helper(0, 0, "", output, n);
        return output;
    }

    private void helper(int left, int right, String current, List<String> output, int n) {
        if (left == n && right == n) {
            output.add(current);
            return;
        }
        if (left < n) {
            String s = current + "(";
            helper(left+1, right, s, output, n);
        }
        if (right < left) {
            String s = current + ")";
            helper(left, right+1, s, output, n);
        }
    }
}
