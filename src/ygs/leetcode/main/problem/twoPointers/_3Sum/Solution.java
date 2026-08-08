package ygs.leetcode.main.problem.twoPointers._3Sum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < n - 2; i++){
            if(i > 0 && nums[i - 1] == nums[i]) continue;

            int j = i + 1;
            int k = n - 1;
            while(j < k){
                int num1 = nums[i];
                int num2 = nums[j];
                int num3 = nums[k];
                if(num1 + num2 + num3 == 0){
                    List<Integer> triple = new ArrayList<>();
                    triple.add(num1);
                    triple.add(num2);
                    triple.add(num3);
                    answer.add(triple);
                }

                if(num1 + num2 + num3 <= 0){
                    j++;
                    while(nums[j] == nums[j - 1] && j < k){
                        j++;
                    }
                }else if(num1 + num2 + num3 > 0){
                    k--;
                    while(nums[k] == nums[k + 1] && j < k){
                        k--;
                    }
                }
            }
        }


        return answer;
    }

}