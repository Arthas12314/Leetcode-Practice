import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/17
 * @time: 20:45
 */
public class Solution85 {
    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        if (matrix.length < 1 || matrix[0].length < 1) {
            return maxArea;
        }
        int line = matrix.length, row = matrix[0].length;
        int[] column = new int[row];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < row; j++) {
                if (matrix[i][j] == '1') {
                    column[j]++;
                } else {
                    column[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(column));
        }
        return maxArea;
    }

    private int largestRectangleArea(int[] heights) {
        int[] temp = new int[heights.length + 2];
        System.arraycopy(heights, 0, temp, 1, heights.length);
        int maxArea = 0;
        int height = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < temp.length; i++) {
            while (!deque.isEmpty() && temp[i] < temp[deque.peek()]) {
                height = deque.pop();
                maxArea = Math.max(maxArea, (i - deque.peek() - 1) * temp[height]);
            }
            deque.push(i);
        }
        return maxArea;
    }
}
