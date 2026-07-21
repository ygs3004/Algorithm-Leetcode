package ygs.leetcode.main.problem.two_pointers;

import java.util.*;

public class Solution {
    public boolean isPalindrome(String s) {

        ArrayList<Integer> a = new ArrayList<>();

        s = s.toLowerCase();
        StringBuilder createdSb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                createdSb.append(c);
            }
            if(c >= '0' && c <= '9'){
                createdSb.append(c);
            }
        }

        String newStr = createdSb.toString();
        String reverseStr = new StringBuilder(newStr).reverse().toString();
        return newStr.equals(reverseStr);
    }
}