package com.michaelho.medium.to300;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _210_CourseScheduleII {

    int[] findOrder(int numCourses, int[][] prerequisites) {
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

        List<Integer> output = new ArrayList<>();
        boolean[] okCourse = new boolean[numCourses];
        boolean[] visited = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (okCourse[i])
                continue;

            findOrder(map, i, visited, okCourse, output);
            if (!okCourse[i])
                return new int[0];
        }
        return output.stream().mapToInt(Integer::intValue).toArray();
    }

    private void findOrder(HashMap<Integer, List<Integer>> map, int current, boolean[] visited, boolean[] okCourse, List<Integer> output) {
        if (map.get(current) != null) {
            visited[current] = true;
            List<Integer> pres = map.get(current);
            for (int i = 0; i < pres.size(); i++) {
                if (okCourse[pres.get(i)])
                    continue;

                if (visited[pres.get(i)]) {
                    okCourse[current] = false;
                    return;
                }
                findOrder(map, i, visited, okCourse, output);
                if (!okCourse[pres.get(i)]) {
                    okCourse[current] = false;
                    return;
                }
            }
            visited[current] = false;
        }
        okCourse[current] = true;
        output.add(current);
    }
}
