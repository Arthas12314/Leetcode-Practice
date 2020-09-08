/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/7
 * @time: 15:38
 */
public class Solution48 {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len / 2; i++) {
            int[] temp = matrix[len - i - 1];
            matrix[len - i - 1] = matrix[i];
            matrix[i] = temp;
        }

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void rotate2(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len / 2; i++) {
            for (int j = i; j < len - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - j - 1][i];
                matrix[len - j - 1][i] = matrix[len - i - 1][len - j - 1];
                matrix[len - i - 1][len - j - 1] = matrix[j][len - i - 1];
                matrix[j][len - i - 1] = temp;
            }
        }
    }
}
