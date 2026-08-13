package ygs.leetcode.main.problem.dynamicProgramming2D.longestCommonSubsequence;

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int text1Length = text1.length();
        int text2Length = text2.length();

        int[][] dp = new int[text1Length + 1][text2Length + 1];

        for(int i = 1; i <= text1Length; i++){
            char c1 = text1.charAt(i - 1);
            for(int j = 1; j <= text2Length; j++){
                char c2 = text2.charAt(j - 1);
                if(c2 == c1){
                    dp[i][j] = dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[text1Length][text2Length];
    }
}