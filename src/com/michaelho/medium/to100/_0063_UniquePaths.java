package com.michaelho.medium.to100;

public class _0063_UniquePaths {

    int uniquePaths(int m, int n) {
        if (m == 0 || n == 0)
            return 0;

        int[][] output = new int[m][n];
        output[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i-1 >= 0)
                    output[i][j] += output[i-1][j];
                if (j-1 >= 0)
                    output[i][j] += output[i][j-1];
            }
        }
        return output[m-1][n-1];
    }
}
