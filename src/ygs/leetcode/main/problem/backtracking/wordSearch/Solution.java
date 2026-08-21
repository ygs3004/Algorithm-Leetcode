package ygs.leetcode.main.problem.backtracking.wordSearch;

public class Solution {

    int[] dr = {1, 0, -1, 0};
    int[] dc = {0, 1, 0, -1};
    boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        visited = new boolean[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(0)){
                    visited[i][j] = true;
                    if(dfs(board, i, j, 0, word)){
                        return true;
                    };
                    visited[i][j] = false;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, int r, int c, int idx, String word){
        if(idx == word.length() - 1){
            return true;
        }

        if(idx > word.length() - 1){
            return false;
        }

        int nextIdx = idx + 1;
        for(int dir = 0; dir < 4; dir++){
            int nextRow = r + dr[dir];
            int nextCol = c + dc[dir];
            if(nextRow >= 0 && nextRow < board.length
                    && nextCol >= 0 && nextCol < board[0].length
                    && !visited[nextRow][nextCol]
                    && board[nextRow][nextCol] == word.charAt(nextIdx)
            ){
                visited[nextRow][nextCol] = true;
                if(dfs(board, nextRow, nextCol, nextIdx, word)){
                    return true;
                };
                visited[nextRow][nextCol] = false;
            }
        }

        return false;
    }
}