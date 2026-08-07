package ygs.leetcode.main.problem.mathGeometry.rotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        for(int i = 0; i <= n; i++){
            // 4분면을 한번에 돌리므로 i row를 돌렸다는 것은 i, n-i 의 row와 col 을 해결한 것이므로
            // j = i, j < n -i 조건으로 반복 처리하지 않게한다.
            for(int j = i; j < n - i ; j++){
                int temp1 = matrix[i][j];        // 상
                int temp2 = matrix[j][n - i];    // 우
                int temp3 = matrix[n - i][n - j];// 하
                int temp4 = matrix[n - j][i];    // 좌

                // 회전
                matrix[i][j] = temp4;
                matrix[j][n - i] = temp1;
                matrix[n - i][n - j] = temp2;
                matrix[n - j][i] = temp3;
            }
        }
    }
}