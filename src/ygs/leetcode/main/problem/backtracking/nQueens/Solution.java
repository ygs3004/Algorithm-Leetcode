package ygs.leetcode.main.problem.backtracking.nQueens;

import java.util.*;

public class Solution {

    final String QUEEN = "Q";
    final String EMPTY = ".";
    int[] dr = {0, 1, 0, -1, 1, 1, -1, -1};
    int[] dc = {1, 0, -1, 0, 1, -1, 1, -1};
    boolean[][] visited;
    List<List<String>> answer;
    int n;

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        answer = new ArrayList<>();
        visited = new boolean[n][n];

        for(int col = 0; col < n; col++){
            visited[0][col] = true;
            dfs(0, col);
            visited[0][col] = false;
        }

        return answer;
    }

    private void dfs(int row, int col){
        if(invalid(row, col)){
            return;
        }

        int nextRow = row + 1;

        if(nextRow == n){
            List<String> result = new ArrayList<>();
            StringBuilder resultRow = new StringBuilder();
            for(int i = 0; i < n; i++){
                for(int j = 0; j < visited.length; j++){
                    String value = visited[i][j] ? QUEEN : EMPTY;
                    resultRow.append(value);
                }
                result.add(resultRow.toString());
                resultRow.setLength(0);
            }

            answer.add(result);
            return;
        }

        for(int nextCol = 0; nextCol < n; nextCol++){
            if(!visited[nextRow][nextCol]){
                visited[nextRow][nextCol] = true;
                dfs(nextRow, nextCol);
                visited[nextRow][nextCol] = false;
            }
        }

    }

    private boolean invalid(int row, int col){

        for(int i = 0; i < dr.length;i ++){
            int nextRow = row + dr[i];
            int nextCol = col + dc[i];
            while(nextRow >= 0 && nextRow < n
                    && nextCol >= 0 && nextCol < n){
                if(visited[nextRow][nextCol]) return true;
                nextRow = nextRow + dr[i];
                nextCol = nextCol + dc[i];
            }
        }

        return false;
    }

}