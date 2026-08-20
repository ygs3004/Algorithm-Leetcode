package ygs.leetcode.main.problem.twoPointers.trappingRainWater;

public class Solution {
    public int trap(int[] height) {

        int answer = 0;
        int bottom = 0;
        int l = 0;
        int r = height.length - 1;

        while(l < r){
            int leftHeight = height[l];
            int rightHeight = height[r];
            int minHeight = Math.min(leftHeight, rightHeight);
            for(int i = l; i <= r; i++){
                int nowHeight = height[i];
                if(nowHeight < minHeight){
                    answer += minHeight - Math.max(nowHeight, bottom);
                }
            }

            bottom = minHeight;
            if(leftHeight > rightHeight){
                while(l < r && height[r] <= rightHeight){
                    r--;
                }
            }else{
                while(l < r && height[l] <= leftHeight){
                    l++;
                }
            }
        }

        return answer;
    }
}