package com.michaelho.easy.to100;

public class _0026_RemoveDuplicatesFromSortedArray {

    int removeDuplicates(int[] nums) {
        int index = 0;
        int last = 0;
        int moved = 0;
        while (index < nums.length - moved) {
            if (index - 1 >= 0 && nums[index - 1] != nums[index]) {
                int movement = index - last - 1;
                moved += movement;
                for (int i = last + 1; i < nums.length - movement; i++) {
                    nums[i] = nums[index + i - last - 1];
                }
                last++;
                index = last;
            }
            index ++;
        }
        return last + 1;
    }
}
