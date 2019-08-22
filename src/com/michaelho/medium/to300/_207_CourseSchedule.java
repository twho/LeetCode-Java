package com.michaelho.medium.to300;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * LeetCode:
 * */
public class _207_CourseSchedule {


    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < prerequisites.length; i++) {
            if (map.get(prerequisites[i][0]) != null) {
                List<Integer> list = map.get(prerequisites[i][0]);
                list.add(prerequisites[i][1]);
                map.replace(prerequisites[i][0], list);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(prerequisites[i][1]);
                map.put(prerequisites[i][0], list);
            }
        }

        boolean[] okCourse = new boolean[numCourses];
        boolean[] visited = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (okCourse[i])
                continue;

            if (!canFinish(map, i, visited, okCourse)) {
                return false;
            }
        }
        return true;
    }

    private boolean canFinish(HashMap<Integer, List<Integer>> map, int current, boolean[] visited, boolean[] okCourse) {
        if (map.get(current) == null) {
            okCourse[current] = true;
            return true;
        } else {
            List<Integer> list = map.get(current);
            visited[current] = true;
            for (int i = 0; i < list.size(); i++) {
                if (okCourse[list.get(i)])
                    continue;

                if (visited[list.get(i)]) {
                    return false;
                }

                if (!canFinish(map, list.get(i), visited, okCourse)) {
                    return false;
                }
            }
        }
        visited[current] = false;
        okCourse[current] = true;
        return true;
    }
}
