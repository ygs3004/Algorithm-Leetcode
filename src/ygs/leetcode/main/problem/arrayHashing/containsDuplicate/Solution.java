package ygs.leetcode.main.problem.arrayHashing.containsDuplicate;

import java.util.*;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int size = 0;
        for(int i = 0; i < nums.length; i++){
            size++;
            set.add(nums[i]);
            if(size != set.size()) return true;
        }

        return false;
    }
}