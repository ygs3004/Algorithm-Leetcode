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
        // 현재 좌표가 땅인지 확인
        if (grid[row][col] != LAND) {
            return false;
        }

        // 땅일 경우 최종적으로 true return, return 이전에 연결된 땅을
        // bfs로 CHECK_LAND로 바꾸어 둔다. 연결된 땅은 땅으로 확인되지 않으므로
        // 연결된 땅 전체를 하나로 확인 가능하다.
        grid[row][col] = CHECK_LAND;

        // 아래, 좌, 위, 우 각 방향 별로 확인하기 위한 방향 배열
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, -1, 0, 1};

        // que 에 넣기 위해 Pos class를 만들어서 이용, int[] 을 사용해도 무방하다.
        Queue<Pos> que = new ArrayDeque<>();
        que.add(new Pos(row, col));

        while (!que.isEmpty()) {
            Pos cur = que.poll();
            for (int i = 0; i < 4; i++) {
                int nextr = cur.r + dr[i];
                int nextc = cur.c + dc[i];

                // 그리드 범위조건, 땅인 부분의 경우 CHECK로 변환
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