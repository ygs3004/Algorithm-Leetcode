package ygs.leetcode.main.problem.intervals.nonOverlappingIntervals;

import java.util.*;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            return Integer.compare(a[0],b[0]);
        });

        int answer = 0;
        boolean[] removed = new boolean[intervals.length];
        for(int i = 0; i < intervals.length - 1; i++){
            if(removed[i]) continue;

            int[] itv1 = intervals[i];
            for(int j = i + 1; j < intervals.length; j++){
                if(removed[j]) continue;

                int[] itv2 = intervals[j];
                if(itv2[0] < itv1[1]){
                    answer++;
                    if(itv1[1] > itv2[1]){
                        removed[i] = true;
                        break;
                    }
                    removed[j] = true;
                }
            }
        }

        return answer;
    }
}