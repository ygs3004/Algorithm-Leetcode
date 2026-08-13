package ygs.leetcode.main.problem.intervals.insertInterval;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0] );
        for(int[] interval:intervals){
            pq.add(interval);
        }
        pq.add(newInterval); // newInterval 을 넣어준다.

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