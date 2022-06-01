public class Solution598 {
    public int maxCount(int m, int n, int[][] ops) {
        int minRow = n;
        int minLine = m;
        for (int index = 0; index < ops.length; index++) {
            minLine = Math.min(minLine, ops[index][0]);
            minRow = Math.min(minRow, ops[index][1]);
        }
        return minLine * minRow;
    }
}
