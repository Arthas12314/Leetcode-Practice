import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/17
 * @time: 17:32
 */
public class Solution84 {
    public int largestRectangleArea(int[] heights) {
        int[] temp = new int[heights.length + 2];
        System.arraycopy(heights, 0, temp, 1, heights.length);
        Deque<Integer> deque = new ArrayDeque<>();
        int max = 0;
        for (int i = 0; i < temp.length; i++) {
            while (!deque.isEmpty() && temp[i] < temp[deque.peek()]) {
                int height = temp[deque.pop()];
                max = Math.max(max, (i - deque.peek() - 1) * height);
            }
            deque.push(i);
        }
        return max;
    }
}
