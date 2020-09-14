/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/14
 * @time: 15:09
 */
public class Solution73 {
    public void setZeroes(int[][] matrix) {
        int line = matrix.length;
        if (line < 1) {
            return;
        }
        int row = matrix[0].length;
        if (row < 1) {
            return;
        }

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < row; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < line; k++) {
                        if (matrix[k][j] == 0) {
                            continue;
                        }
                        matrix[k][j] = Integer.MIN_VALUE + 10;
                    }
                    for (int k = 0; k < row; k++) {
                        if (matrix[i][k] == 0) {
                            continue;
                        }
                        matrix[i][k] = Integer.MIN_VALUE + 10;
                    }
                }
            }
        }
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < row; j++) {
                if (matrix[i][j] == Integer.MIN_VALUE + 10) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
