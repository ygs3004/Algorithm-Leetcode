package ygs.leetcode.main.problem.greedy.jumpGame2;

class Solution {
    public int jump(int[] nums) {
        return stepsToJumpFrom(nums, 0);
    }

    private int stepsToJumpFrom(int[] nums, int start) {
        if (start >= nums.length - 1) {
            return 0;
        }
        if (start + nums[start] >= nums.length - 1) {
            return 1;
        }
        int furthestReachableNext = -1;
        int nextStart = start;
        for (int i = start + 1; i <= start + nums[start]; i++) {
            if (i + nums[i] > furthestReachableNext) {
                furthestReachableNext = i + nums[i];
                nextStart = i;
                if (furthestReachableNext >= nums.length - 1) {
                    break;
                }
            }
        }
        return stepsToJumpFrom(nums, nextStart) + 1;

    }
}