package ygs.leetcode.main.problem.dynamicProgramming1D.longestIncreasingSubsequence;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;

        int answer = 1;
        for(int i = 1; i < nums.length; i++){
            int num = nums[i];
            int search = i;
            dp[i] = 1;
            while(search-- > 0){
                int compare = nums[search];
                if(compare < num){
                    dp[i] = Math.max(dp[search] + 1, dp[i]);
                }
            }

            answer = Math.max(dp[i], answer);
        }

        return answer;
    }
}
