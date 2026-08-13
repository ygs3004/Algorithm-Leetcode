package ygs.leetcode.main.problem.mathGeometry.spiralMatrix;

import java.util.*;

public class Solution {

    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
    static boolean[][] visited;

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();

        visited = new boolean[matrix.length][matrix[0].length];

        int r = 0;
        int c = 0;
        int dir = 0;

        while(isValidDirection(matrix, r, c)){
            visited[r][c] = true;

            answer.add(matrix[r][c]);
            int nextr = r + dr[dir];
            int nextc = c + dc[dir];
            if(!isValidDirection(matrix, nextr, nextc)){
                dir = (dir + 1) % 4; // 0 - 우, 1 - 하, 2 - 좌, 3 - 상
                nextr = r + dr[dir];
                nextc = c + dc[dir];
            }

            r = nextr;
            c = nextc;
        }

        return answer;
    }

    private boolean isValidDirection(int[][] matrix, int r, int c){
        return r >= 0 && r < matrix.length
                && c >= 0 && c < matrix[0].length
                && !visited[r][c];
    }
}