package ygs.leetcode.main.problem.mathGeometry.happyNumber;

import java.util.*;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(n > 1){
            int sum = 0;
            while(n > 0){
                int mod = n % 10;
                sum += mod * mod;
                n = n / 10;
            }

            n = sum;
            if(set.contains(n)) break;
            set.add(n);
        }

        return n == 1;
    }
}