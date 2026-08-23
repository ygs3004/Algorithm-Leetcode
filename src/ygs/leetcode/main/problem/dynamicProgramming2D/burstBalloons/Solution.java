package ygs.leetcode.main.problem.dynamicProgramming2D.burstBalloons;

public class Solution {
    public int maxCoins(int[] nums) {
        int[] arr = new int[nums.length + 2];
        for(int i = 0; i < nums.length; i++){
            arr[i + 1] = nums[i];
        }K
        arr[0] = 1;
        arr[arr.length - 1] = 1;
        int n = arr.length;

        int[][] dp = new int[n][n];

        for(int k = 0; k < n - 2; k++){
            for(int l = 1; l + k <= n - 2; l++){
                int r = l + k ;
                for(int j = l; j <= r; j++){
                    int front = dp[l][j - 1];
                    int shoot =  arr[l - 1] * arr[j] * arr[r + 1];
                    int back = dp[j + 1][r];

                    dp[l][r] = Math.max(dp[l][r], front + shoot + back);
                }
            }
        }

        return dp[1][n - 2];
    }

}