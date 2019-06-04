package com.michaelho.medium.to100;

import java.util.Arrays;

class _0016_3SumClosest {

    int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int index = 0;
        int output = 100000;

        while (index < nums.length) {
            int left = index + 1;
            int right = nums.length - 1;
            while (left < right) {
                int val = nums[index] + nums[left] + nums[right];
                if (Math.abs(target-val) < Math.abs(target-output)) {
                    output = val;
                }
                if (val < target) {
                    left++;
                    while (left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                } else {
                    right--;
                    while (left < right && nums[right] == nums[right+1]) {
                        right--;
                    }
                }
            }
            index++;
        }
        return output;
    }
}
