package ygs.leetcode.main.problem.bitManipulation.sumOfTwoIntegers;

public class Solution {
    public int getSum(int a, int b) {
        while(b != 0){
            int temp = a;
            a = a ^ b;
            b = b & temp;
            b = b << 1;
        }

        return a;
    }
}