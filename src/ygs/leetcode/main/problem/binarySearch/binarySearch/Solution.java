package ygs.leetcode.main.problem.binarySearch.binarySearch;

public class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int row = 0;
        int high = len - 1;
        int mid = (row + high) / 2;
        while(nums[mid] != target){
            int cur = nums[mid];
            if(cur > target){
                if(mid - 1 < 0 || nums[mid - 1] < target){
                    mid = -1;
                    break;
                }
                high = mid - 1;
            }else{
                if(mid + 1 >= nums.length || nums[mid + 1] > target){
                    mid = -1;
                    break;
                }
                row = mid + 1;
            }
            mid = (high + row) / 2;
        }

        return mid;
    }
}