package ygs.leetcode.main.problem.dynamicProgramming1D.coinChange;

import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);

        int[] dp = new int[amount + 1];
        int INF = 10001;
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            for (int j = coin; j <= amount; j++) {
                dp[j] = Math.min(dp[j - coin] + 1, dp[j]);
            }
        }


        return dp[amount] == INF ? -1 : dp[amount];
    }
}