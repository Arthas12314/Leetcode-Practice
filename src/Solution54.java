import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/9
 * @time: 16:50
 */
public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length < 1) {
            return res;
        }

        int up = 0, down = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (true) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[up][i]);
            }
            if (++up > down) {
                break;
            }

            for (int i = up; i <= down; i++) {
                res.add(matrix[i][right]);
            }
            if (--right < left) {
                break;
            }

            for (int i = right; i >= left; i--) {
                res.add(matrix[down][i]);
            }
            if (--down < up) {
                break;
            }

            for (int i = down; i >= up; i--) {
                res.add(matrix[i][left]);
            }
            if (++left > right) {
                break;
            }
        }
        return res;
    }
}
