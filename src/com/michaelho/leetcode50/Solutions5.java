package com.michaelho.leetcode50;

import java.util.HashMap;

public class Solutions5 {
    /**
     * LeetCode: https://leetcode.com/problems/two-sum/
     * */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hash.get(target - nums[i]) != null) {
                return new int[] {hash.get(target - nums[i]), i};
            }
            hash.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }


}
