package ygs.leetcode.main.problem.greedy.jumpGame;

public class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for(int i = nums.length - 1; i >= 0; i--){
            int num = nums[i];
            if(i + num >= goal){
                goal = i;
            }
        }

        return goal == 0;
    }
}