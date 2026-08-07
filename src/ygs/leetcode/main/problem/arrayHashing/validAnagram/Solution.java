package ygs.leetcode.main.problem.arrayHashing.validAnagram;

public class Solution {
    public boolean isAnagram(String s, String t) {
        // 글자의 길이가 다르다면 다른 것, for 문의 s.length()로 두 문자열의 문자를 순회할 것이므로 체크
        if(s.length() != t.length()) return false;

        int[] word1 = new int[26];
        int[] word2 = new int[26];
        for(int i  = 0; i < s.length(); i++){
            // 문자에 따라 인덱스의 값 증가, 'a'의 값 0번 인덱스로 하여 기준으로 한다.
            word1[s.charAt(i) - 'a']++;
            word2[t.charAt(i) - 'a']++;
        }

        for(int i = 0; i < word1.length; i++){
            // 문자의 조합이 똑같은지 확인
            if(word1[i] != word2[i]) return false;
        }

        return true;
    }
}