package ygs.leetcode.main.problem.bitManipulation.numberof1Bits;

public class Solution {
    public int hammingWeight(int n) {
        // 1. 문자열 이용
        // String s = Integer.toString(n, 2);
        // int answer = 0;
        // for(char c: s.toCharArray()){
        //     if(c == '1') answer++;
        // }
        // return answer;

        // 2. 비트연산자 이용
        // int answer = 0;
        // while(n != 0){
        //     if((n & 1) == 1) answer++;
        //     n = n >> 1;
        // }
        // return answer;

        // 3. Java Integer 메서드 이용
        return Integer.bitCount(n);
    }
}