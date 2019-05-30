package com.michaelho.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class _0015_3Sum {

    List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);

        if (nums.length < 3)
            return output;

        int index = 0;
        while (index < nums.length - 2) {
            int left = index + 1;
            int right = nums.length - 1;

            while (left < right) {
                int val = nums[index] + nums[left] + nums[right];
                if (val == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[index]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    output.add(list);
                    right --;
                    while (right > 0 && nums[right] == nums[right + 1]) {
                        right--;
                    }
                    left ++;
                    while (left < nums.length && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else if (val > 0) {
                    right --;
                } else {
                    left ++;
                }
            }
            while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
                index++;
            }

            index ++;
        }

        return output;
    }
}
