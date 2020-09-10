import java.util.Arrays;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/10
 * @time: 16:37
 */
public class Solution59 {
    public static void main(String[] args) {
        Solution59 t = new Solution59();
        int[][] result = t.generateMatrix(5);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int left = 0, right = n - 1, up = 0, down = n - 1;
        int count = 1, total = n * n;
        while (count <= total) {
            for (int i = left; i <= right; i++) {
                result[up][i] = count++;
            }
            up++;
            for (int i = up; i <= down; i++) {
                result[i][right] = count++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                result[down][i] = count++;
            }
            down--;
            for (int i = down; i >= up; i--) {
                result[i][left] = count++;
            }
            left++;
        }
        return result;
    }
}
