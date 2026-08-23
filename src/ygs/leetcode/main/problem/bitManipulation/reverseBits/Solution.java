package ygs.leetcode.main.problem.bitManipulation.reverseBits;

public class Solution {
    public int reverseBits(int n) {
        String from = Integer.toString(n, 2);
        StringBuilder sb = new StringBuilder(from);
        sb.reverse();

        int needZero = 32 - sb.length();
        for(int i = 0; i < needZero; i++){
            sb.append('0');
        }

        return Integer.valueOf(sb.toString(), 2);
    }
}