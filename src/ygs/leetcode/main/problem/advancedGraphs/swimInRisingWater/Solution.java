package ygs.leetcode.main.problem.advancedGraphs.swimInRisingWater;

import java.util.*;

public class Solution {

    public int swimInWater(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int[][] minTimes = new int[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(minTimes[i], Integer.MAX_VALUE);
        }
        minTimes[0][0] = grid[0][0];
        bfs(grid, minTimes);

        return minTimes[m - 1][n - 1];
    }

    private void bfs(int[][] grid, int[][] minTimes){

        int[] dr = {-1,0,1,0};
        int[] dc = {0,-1,0,1};

        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0,0});

        while(!q.isEmpty()){
            int[] now = q.poll();
            int r = now[0];
            int c = now[1];

            for(int i = 0; i < 4; i++){
                int nextRow = r + dr[i];
                int nextCol = c + dc[i];
                int time = minTimes[r][c];

                if(nextRow >= 0 && nextRow < grid.length
                        && nextCol >= 0 && nextCol < grid[0].length
                ){
                    int nextTime = Math.max(time, grid[nextRow][nextCol]);
                    if(minTimes[nextRow][nextCol] > nextTime){
                        minTimes[nextRow][nextCol] = nextTime;
                        q.add(new int[]{nextRow, nextCol});
                    }
                }
            }
        }
    }
}