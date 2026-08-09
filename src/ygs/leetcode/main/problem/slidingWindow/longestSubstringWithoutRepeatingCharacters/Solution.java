package ygs.leetcode.main.problem.slidingWindow.longestSubstringWithoutRepeatingCharacters;

import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        Queue<Character> que = new ArrayDeque<>();
        int answer = 0;

        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);

            while(set.contains(cur)){
                set.remove(que.poll());
            }

            set.add(cur);
            que.add(cur);
            answer = Math.max(answer, set.size());
        }

        return answer;
    }

}