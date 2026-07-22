package ygs.leetcode.main.problem.twoPointers.isPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        // 1. 문자열의 소문자 변환
        s = s.toLowerCase();

        // 2. non-alphanumeric 문자를 제거, alphanumeric 문자만으로 문자열을 새로 구성하기 위해 StringBuilder를 이용
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

        // 3. StringBuilder의 reverse() 메서드를 이용하여 boolean 값 체크
        String newStr = createdSb.toString();
        String reverseStr = new StringBuilder(newStr).reverse().toString();
        return newStr.equals(reverseStr);
    }
}