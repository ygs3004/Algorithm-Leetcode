package ygs.leetcode.main.problem.intervals.mergeIntervals;

import java.util.*;

public class Solution {
    public int[][] merge(int[][] intervals) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0] );
        for(int[] interval:intervals){
            pq.add(interval);
        }

        List<int[]> newArray = new ArrayList<>();

        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            while(!pq.isEmpty() && pq.peek()[0] <= cur[1]){
                int[] next = pq.poll();
                cur[1] = Math.max(next[1], cur[1]);
            }
            newArray.add(cur);
        }

        int finalSize = newArray.size();
        int[][] answer = new int[finalSize][2];

        for(int i = 0; i < finalSize; i++){
            answer[i][0] = newArray.get(i)[0];
            answer[i][1] = newArray.get(i)[1];
        }

        return answer;
    }
}