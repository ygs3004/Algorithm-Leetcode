package ygs.leetcode.main.problem.heapPriorityQueue.kClosestPointstoOrigin;

import java.util.*;

public class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for(int i = 0; i < points.length; i++){
            int x = points[i][0];
            int y = points[i][1];
            pq.add(new Point(x, y));
        }

        int[][] answer = new int[k][2];
        while(k-- > 0){
            Point point = pq.poll();
            answer[k][0] = point.x;
            answer[k][1] = point.y;
        }

        return answer;
    }

    private class Point implements Comparable<Point>{
        int x;
        int y;
        int distFromOrigin;

        Point(int x, int y){
            this.x = x;
            this.y = y;
            this.distFromOrigin = x*x + y*y;
        }

        @Override
        public int compareTo(Point o){
            return this.distFromOrigin - o.distFromOrigin;
        }
    }
}