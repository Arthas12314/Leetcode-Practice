package coding.interviews;


/**
 * @author Arthas
 */
public class Solution4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }
        int i = 0;
        int j = matrix[0].length - 1;
        while (true) {
            if (i >= matrix.length || j < 0) {
                return false;
            }
            if (matrix[i][j] < target) {
                i++;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        Solution4 t = new Solution4();
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(t.findNumberIn2DArray(matrix, 5));
    }
}
