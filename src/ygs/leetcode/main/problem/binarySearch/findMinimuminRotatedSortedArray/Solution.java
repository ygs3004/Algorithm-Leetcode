package ygs.leetcode.main.problem.binarySearch.findMinimuminRotatedSortedArray;

public class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int mid = (l + r) / 2;

        while(l <= r){
            mid = l + (r - l) / 2;
            int n = nums[mid];

            // 오른쪽이 정렬
            if(n < nums[r]){
                r = mid;
            // 왼쪽이 정렬된 경우
            }else{
                l = mid + 1;
            }
        }

        return nums[mid];
    }

}