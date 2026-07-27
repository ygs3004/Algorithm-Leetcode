package ygs.leetcode.main.problem.binarySearch.binarySearch;

public class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int low = 0;
        int high = len - 1;
        int mid = (low + high) / 2;

        // while 의 조건문을 통해 타겟에 도달했는지 확인
        while(nums[mid] != target){
            int cur = nums[mid];
            if(cur > target){
                // index 범위를 초과하거나, 답이 없거나를 체크
                if(mid - 1 < 0 || nums[mid - 1] < target){
                    mid = -1;
                    break;
                }
                
                // 중간점 체크를 위해 값 비교를 통해, low - high 값 전환
                high = mid - 1;

            }else{
                // index 범위를 초과하거나, 답이 없거나를 체크
                if(mid + 1 >= nums.length || nums[mid + 1] > target){
                    mid = -1;
                    break;
                }

                // 중간점 체크를 위해 값 비교를 통해, low - high 값 전환
                low = mid + 1;
            }
            
            // 변경된 low, high 값을 이용해 새로운 중간점 변경
            mid = (high + low) / 2;
        }

        return mid;
    }
}