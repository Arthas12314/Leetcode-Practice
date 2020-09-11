/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/11
 * @time: 22:15
 */
public class Solution64 {
    private int minPath = Integer.MAX_VALUE;

    public int minPathSum(int[][] grid) {
        int line = grid.length;
        if (line < 1) {
            return 0;
        }
        int row = grid[0].length;
        if (row < 1) {
            return 0;
        }
        int[][] dp = new int[line][row];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < line; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < row; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < line; i++) {
            for (int j = 1; j < row; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[line - 1][row - 1];
    }

    /**
     * dfs超时
     *
     * @param grid
     * @return
     */
    public int minPathSum2(int[][] grid) {
        if (grid.length < 1 || grid[0].length < 1) {
            return 0;
        }
        dfs(grid, 0, 0, 0);
        return minPath;
    }

    private void dfs(int[][] grid, int i, int j, int sum) {
        sum += grid[i][j];
        int line = grid.length;
        int row = grid[0].length;
        if (i == line - 1 && j == row - 1) {
            minPath = Math.min(minPath, sum);
            return;
        }

        if (i < line - 1) {
            dfs(grid, i + 1, j, sum);
        }
        if (j < row - 1) {
            dfs(grid, i, j + 1, sum);
        }
    }
}
