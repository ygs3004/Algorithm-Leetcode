package ygs.leetcode.main.problem.dynamicProgramming2D.regularExpressionMatching;

public class Solution {
    public boolean isMatch(String s, String p) {

        final String dotStar = String.valueOf((char)('a' - 1));

        // * + 문자를 대문자로, . 일 경우 dotStar로 치환(char < 'a'로 부등호로 비교하기 위하여)
        while(p.indexOf("*") > - 1){
            int starIdx = p.indexOf("*");
            String starChar = String.valueOf(p.charAt(starIdx - 1)).toUpperCase();
            starChar = starChar.equals(".") ? dotStar : starChar;
            p = p.substring(0, starIdx - 1) + starChar + p.substring(starIdx + 1);
        }

        boolean[][] dp = new boolean[p.length() + 1][s.length() + 1];
        dp[0][0] = true;

        for(int i = 1; i < dp.length; i++){
            dp[i][0] = (p.charAt(i - 1) != '.') && (p.charAt(i - 1) < 'a') && dp[i - 1][0];
        }

        for(int i = 1; i < dp.length; i++){
            char char1 = p.charAt(i - 1);
            for(int j = 1; j < dp[0].length; j++){
                char char2 = s.charAt(j - 1);
                if(char1 == '.' || (char1 == char2)){
                    dp[i][j] = dp[i - 1][j - 1];
                }else if(char1 < 'a'){
                    dp[i][j] = dp[i - 1][j] || (dp[i][j - 1]
                            && (char1 == (char)('a' - 1) // dotStart일 경우
                                || ((char1 + ('a' - 'A')) == char2))); // 대문자일 경우
                }else{
                    dp[i][j] = false;
                }
            }
        }

        return dp[p.length()][s.length()];

    }

}