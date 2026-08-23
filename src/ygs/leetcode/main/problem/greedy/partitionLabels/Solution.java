package ygs.leetcode.main.problem.greedy.partitionLabels;

import java.util.*;

public class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            int lastIdx = s.lastIndexOf(s.charAt(i));
            int now = i;
            while(now++ < lastIdx){
                lastIdx = Math.max(lastIdx, s.lastIndexOf(s.charAt(now)));
            }

            answer.add(lastIdx - i + 1);
            i = now - 1;
        }

        return answer;
    }
}