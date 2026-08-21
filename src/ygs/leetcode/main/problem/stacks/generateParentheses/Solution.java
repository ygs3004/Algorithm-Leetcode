package ygs.leetcode.main.problem.stacks.generateParentheses;

import java.util.*;

public class Solution {

    static String[] letter = {"(", ")"};

    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        dfs(n * 2, sb, answer);

        return answer;
    }

    private void dfs(int n, StringBuilder sb, List<String> answer){
        boolean isLast = n == sb.length();
        if(!isPossible(sb.toString(), isLast)){
            return;
        }

        if(isLast){
            answer.add(sb.toString());
            return;
        }

        for(int i = 0; i < 2; i++){
            sb.append(letter[i]);
            dfs(n, sb, answer);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    private boolean isPossible(String str, boolean isComplete){
        int check = 0;
        for(char c: str.toCharArray()){
            if(c == '('){
                check++;
            }else{
                if(check == 0){
                    return false;
                }

                check--;
            }
        }

        return isComplete ? check == 0 : true;
    }

}