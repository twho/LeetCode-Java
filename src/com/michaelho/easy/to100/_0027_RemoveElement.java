package com.michaelho.easy.to100;

public class _0027_RemoveElement {

    int removeElement(int[] nums, int val) {
        int index = 0;
        int duplicates = 0;
        while (index < nums.length - duplicates) {
            if (nums[index] == val) {
                for (int i = index; i < nums.length-1; i++) {
                    nums[i] = nums[i+1];
                }
                duplicates++;
                continue;
            }
            index ++;
        }
        return nums.length - duplicates;
    }
}
