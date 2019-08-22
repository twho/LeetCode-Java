package com.michaelho.medium.to100;

/**
 * LeetCode: https://leetcode.com/problems/search-insert-position/
 * Hint: use binary search
 * */
public class _0033_SearchRotatedSortedArray {

    int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target) {
                return mid;
            } else if  (nums[mid] >= nums[start]) {
                if (nums[start] <= target && nums[mid] >= target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        if (start > nums.length - 1) {
            return -1;
        } else if (nums[start] == target) {
            return start;
        } else {
            return -1;
        }
    }
}
