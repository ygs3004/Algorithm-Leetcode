package ygs.leetcode.main.problem.graphs.pacificAtlanticWaterFlow;

import java.util.*;

public class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                // pacific,북쪽
                if(i == 0){
                    bfs(i, j, heights, pacific);
                // pacific,서쪽
                }else if(j == 0){
                    bfs(i, j, heights, pacific);
                }

                // atlantic,동쪽
                if(i == m - 1){
                    bfs(i, j, heights, atlantic);
                // atlantic,남쪽
                }else if(j == n - 1){
                    bfs(i, j, heights, atlantic);
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j <n; j++){
                if(pacific[i][j] && atlantic[i][j]) answer.add(List.of(i, j));
            }
        }

        return answer;
    }

    private void bfs(int r, int c, int[][] heights, boolean[][] visited){
        int[] dr = {-1,0,1,0};
        int[] dc = {0,-1,0,1};

        Queue<int[]> que = new ArrayDeque<>();
        que.add(new int[]{r, c});

        while(!que.isEmpty()){
            int[] now = que.poll();
            int row = now[0];
            int col = now[1];
            if(visited[row][col]){
                continue;
            }

            visited[row][col] = true;

            for(int dir = 0; dir < 4; dir++){
                int nextRow = row + dr[dir];
                int nextCol = col + dc[dir];

                if(nextRow >= 0 && nextRow < heights.length
                        && nextCol >= 0 && nextCol < heights[0].length
                        && !visited[nextRow][nextCol]
                        && heights[nextRow][nextCol] >= heights[row][col]){
                    que.add(new int[]{nextRow, nextCol});
                }
            }

        }
    }

}