package ygs.leetcode.main.problem.dynamicProgramming2D.uniquePaths;

public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++){
            dp[i][0] = 1;
        }

        for(int i = 0; i < n; i++){
            dp[0][i] = 1;
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                int fn1 = i - 1 < 0 ? 0 : dp[i - 1][j];
                int fn2 = j - 1 < 0 ? 0 : dp[i][j - 1];
                dp[i][j] = fn1 + fn2;
            }
        }

        return dp[m - 1][n - 1];
    }
}