package ygs.leetcode.main.problem.twoPointers.containerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int answer = 0;
        for(int i = 0; i < height.length - 1; i++){
            for(int j = height.length - 1; j >= i + 1 ; j--){
                int width = j - i;
                if(height[i] < height[j]){
                    answer = Math.max(answer, width * height[i]);
                    break;
                }else{
                    answer = Math.max(answer, width * height[j]);
                }
            }
        }

        return answer;
    }
}