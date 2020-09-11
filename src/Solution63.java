/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/11
 * @time: 21:55
 */
public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int line = obstacleGrid.length;
        if (line < 1) {
            return 0;
        }
        int row = obstacleGrid[0].length;
        int[][] dp = new int[line][row];
        for (int i = 0; i < row && obstacleGrid[0][i] != 1; i++) {
            dp[0][i] = 1;
        }
        for (int j = 0; j < line && obstacleGrid[j][0] != 1; j++) {
            dp[j][0] = 1;
        }

        for (int i = 1; i < line; i++) {
            for (int j = 1; j < row; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[line - 1][row - 1];
    }
}
