package com.michaelho.medium.to300;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MediumTests201to250 {

    @Test
    public void testCourseSchedule() {
        _207_CourseSchedule sol = new _207_CourseSchedule();
        int input1 = 2;
        int[][] inputArr1 = new int[][]{
                new int[] {1, 0}
        };
        assertTrue(sol.canFinish(input1, inputArr1));

        int input2 = 2;
        int[][] inputArr2 = new int[][]{
                new int[] {1, 0},
                new int[] {0, 1}
        };
        assertFalse(sol.canFinish(input2, inputArr2));

        int input3 = 4;
        int[][] inputArr3 = new int[][]{
                new int[] {0, 1},
                new int[] {1, 2},
                new int[] {0, 3},
                new int[] {3, 0}
        };
        assertFalse(sol.canFinish(input3, inputArr3));
    }

    @Test
    public void testCourseScheduleII() {
        _210_CourseScheduleII sol = new _210_CourseScheduleII();
        int input1 = 2;
        int[][] inputArr1 = new int[][]{
                new int[] {1, 0}
        };
        int[] expected1 = new int[] { 0, 1 };
        assertArrayEquals(expected1, sol.findOrder(input1, inputArr1));

        int input2 = 4;
        int[][] inputArr2 = new int[][] {
                new int[] {1, 0},
                new int[] {2, 0},
                new int[] {3, 1},
                new int[] {3, 2}
        };
        int[] expected2 = new int[] { 0, 1, 2, 3 }; // [0,2,1,3] is also correct.
        assertArrayEquals(expected2, sol.findOrder(input2, inputArr2));

    }
}
