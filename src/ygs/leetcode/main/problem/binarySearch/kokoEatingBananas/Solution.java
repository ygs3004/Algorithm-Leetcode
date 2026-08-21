package ygs.leetcode.main.problem.binarySearch.kokoEatingBananas;

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            high = Math.max(piles[i], high);
        }

        int mid = 0;
        int k = Integer.MAX_VALUE;

        while (low <= high) {
            mid = low + (high - low) / 2;
            // int time = 0;
            int time = h;
            for (int i = 0; i < piles.length; i++) {
                int pile = piles[i];
                // time += pile % mid == 0 ? pile / mid : pile / mid + 1;  // [805306368,805306368,805306368] overflow
                time -= pile % mid == 0 ? pile / mid : pile / mid + 1;
            }

            // if(time <= h){
            if (time >= 0) {
                high = mid - 1;
                k = Math.min(k, mid);
            } else {
                low = mid + 1;
            }
        }

        return k;
    }
}

