import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/9
 * @time: 15:27
 */
public class Solution51 {
    private List<List<String>> result;
    private int total;

    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<>();
        total = n;
        char[][] matrix = new char[n][n];
        for (char[] array : matrix) {
            Arrays.fill(array, '.');
        }
        dfs(matrix, 0);
        return result;
    }

    private void dfs(char[][] matrix, int row) {
        if (row == total) {
            List<String> temp = new ArrayList<>();
            for (char[] array : matrix) {
                temp.add(String.valueOf(array));
            }
            result.add(temp);
            return;
        }

        for (int i = 0; i < total; i++) {
            if (checkValid(matrix, row, i)) {
                matrix[row][i] = 'Q';
                dfs(matrix, row + 1);
                matrix[row][i] = '.';
            }
        }
    }

    private boolean checkValid(char[][] matrix, int row, int line) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[row][i] == 'Q' || matrix[i][line] == 'Q') {
                return false;
            }

            for (int j = 0; j < matrix[0].length; j++) {
                if ((j - i == line - row || j + i == line + row) && matrix[i][j] == 'Q') {
                    return false;
                }
            }
        }
        return true;
    }
}
