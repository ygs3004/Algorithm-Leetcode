package ygs.leetcode.main.problem.dynamicProgramming1D.wordBreak;

import java.util.*;

public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j <= i; j++){
                if(dp[j] == true){
                    String check = s.substring(j, i);
                    if(wordDict.contains(check)){
                        dp[i] = true;
                        break;
                    }
                }
            }
        }

        return dp[s.length()];
    }

}
