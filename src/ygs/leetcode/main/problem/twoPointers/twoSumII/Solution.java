package ygs.leetcode.main.problem.twoPointers.twoSumII;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {

        for(int i = 0; i < numbers.length - 1; i++){
            int find = target - numbers[i];
            int l = i + 1;
            int r = numbers.length - 1;

            while(l <= r){
                int mid = l + (r - l) / 2;
                int now = numbers[mid];
                if(now == find){
                    return new int[]{i + 1, mid + 1};
                }

                if(now > find){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }
        }

        return null;
    }
}