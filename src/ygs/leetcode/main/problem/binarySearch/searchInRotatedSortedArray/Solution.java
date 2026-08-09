package ygs.leetcode.main.problem.binarySearch.searchInRotatedSortedArray;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            int s = nums[left];
            int e = nums[right];
            int cur = nums[mid];

            if(target == cur){
                return mid;
            }

            if(cur >= s){
                // 왼쪽이 정렬되어있을 경우
                if(target > cur){
                    left = mid + 1;
                }else if(target >= s){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                // 오른쪽이 정렬되어있을 경우
                if(target < cur){
                    right = mid - 1;
                }else if(target <= e){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}