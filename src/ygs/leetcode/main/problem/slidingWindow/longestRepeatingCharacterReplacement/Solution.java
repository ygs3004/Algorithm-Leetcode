package ygs.leetcode.main.problem.slidingWindow.longestRepeatingCharacterReplacement;

public class Solution {
    public int characterReplacement(String s, int k) {
        int[] current = new int[26];
        int maxRepeat = 0;
        int answer = 0;
        int l = 0;

        for(int r = 0; r < s.length(); r++){
            char now = s.charAt(r);
            current[now - 'A']++;
            maxRepeat = Math.max(maxRepeat, current[now - 'A']);

            if(r - l + 1 - maxRepeat > k){
                current[s.charAt(l) - 'A']--;
                l++;
            }

            answer = Math.max(r - l + 1, answer);
        }

        return answer;
    }
}