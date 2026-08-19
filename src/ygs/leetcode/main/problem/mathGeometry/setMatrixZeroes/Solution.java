package ygs.leetcode.main.problem.mathGeometry.setMatrixZeroes;

public class Solution {

    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] checkRow = new boolean[m];
        boolean[] checkCol = new boolean[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    checkRow[i] = true;
                    checkCol[j] = true;
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(checkRow[i] || checkCol[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

}