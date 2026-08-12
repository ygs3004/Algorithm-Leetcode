package ygs.leetcode.main.problem.advancedGraphs.minCosttoConnectAllPoints;

import java.util.*;

public class Solution {
    public int minCostConnectPoints(int[][] points) {

        int answer = 0;
        boolean[] visited = new boolean[points.length];
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(0, 0, points));

        while(!pq.isEmpty()){
            Edge edge = pq.poll();
            int cur = edge.to;
            if(visited[cur]) continue;
            visited[cur] = true;
            answer += edge.dist;

            for(int next = 0; next < points.length; next++){
                if(next == cur) continue;
                if(!visited[next]){
                    pq.add(new Edge(cur, next, points));
                }
            }
        }

        return answer;
    }

    private static class Edge implements Comparable<Edge>{
        int from;
        int to;
        int dist;

        Edge(int from, int to, int[][] points){
            this.from = from;
            this.to = to;
            this.dist = manDist(points[from], points[to]);
        }

        private int manDist(int[] from, int[] to){
            int xCalc = Math.abs(from[0] - to[0]);
            int yCalc = Math.abs(from[1] - to[1]);
            return xCalc + yCalc;
        }

        @Override
        public int compareTo(Edge o){
            return this.dist - o.dist;
        }

    }

}