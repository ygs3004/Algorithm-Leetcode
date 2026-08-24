package ygs.leetcode.main.problem.binarySearch.medianOfTwoSortedArrays;

import java.util.*;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] answer = new int[nums.length - k + 1];

        int max = 0;
        int maxIdx = 0;
        for(int i = 0; i < k; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIdx = i;
            }
        }

        int ansIdx = 0;
        answer[ansIdx++] = max;

        for(int r = k; r < nums.length; r++){
            int num = nums[r];
            if(nums[r] >= max){
                max = nums[r];
                maxIdx = r;
            }else if(r - k >= maxIdx){
                maxIdx = r - k + 1;
                max = nums[maxIdx];
                for(int i = maxIdx; i <= r; i++){
                    if(nums[i] >= max){
                        max = nums[i];
                        maxIdx = i;
                    }
                }
            }

            answer[ansIdx++] = max;
        }

        return answer;
    }
}