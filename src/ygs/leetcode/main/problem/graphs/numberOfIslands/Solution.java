package ygs.leetcode.main.problem.graphs.numberOfIslands;

import java.util.*;

public class Solution {

    private static final char LAND = '1';
    private static final char WATER = '0';
    private static final char CHECK_LAND = '3';

    public int numIslands(char[][] grid) {
        int cnt = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (bfs(i, j, grid)) {
                    cnt++;
                }
                ;
            }
        }

        return cnt;
    }

    private boolean bfs(int row, int col, char[][] grid) {
        if (grid[row][col] != LAND) {
            return false;
        }

        grid[row][col] = CHECK_LAND;

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, -1, 0, 1};
        Queue<Pos> que = new ArrayDeque<>();
        que.add(new Pos(row, col));

        while (!que.isEmpty()) {
            Pos cur = que.poll();
            for (int i = 0; i < 4; i++) {
                int nextr = cur.r + dr[i];
                int nextc = cur.c + dc[i];

                if (nextr >= 0
                        && nextr < grid.length
                        && nextc >= 0
                        && nextc < grid[0].length
                        && grid[nextr][nextc] == LAND
                ) {
                    grid[nextr][nextc] = CHECK_LAND;
                    que.add(new Pos(nextr, nextc));
                }
            }
        }

        return true;
    }

    private class Pos {
        int r;
        int c;

        Pos(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}