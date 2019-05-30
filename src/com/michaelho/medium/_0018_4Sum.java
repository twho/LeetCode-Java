package com.michaelho.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class _0018_4Sum {

    List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        int idx1 = 0;
        while (idx1 < nums.length-3) {
            int idx2 = idx1 + 1;
            while (idx2 < nums.length - 2) {
                int left = idx2 + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int val = nums[idx1] + nums[idx2] + nums[left] + nums[right];
                    if (val == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[idx1]);
                        list.add(nums[idx2]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        output.add(list);

                        while (left + 1 < right && nums[left+1] == nums[left]) {
                            left++;
                        }
                        left++;

                        while (right - 1 > left && nums[right] == nums[right-1]) {
                            right--;
                        }
                        right--;
                    } else if (val < target) {
                        left++;
                    } else {
                        right--;
                    }
                }

                while (idx2 + 1 < nums.length-2 && nums[idx2+1] == nums[idx2]) {
                    idx2++;
                }
                idx2++;
            }
            while (idx1 + 1 < nums.length-3 && nums[idx1+1] == nums[idx1]) {
                idx1++;
            }
            idx1++;
        }
        return output;
    }
}
