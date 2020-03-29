package CodingInterviews;

/**
 * @author Arthas
 */
public class Solution47 {
    public int maxValue(int[][] grid) {
        int row=grid.length,line=grid[0].length;
        int[] dp=new int[line];
        for (int i = 0; i < row; i++) {
            dp[0]=dp[0]+grid[i][0];
            for (int j = 1; j < line; j++) {
                dp[j]=Math.max(dp[j-1],dp[j])+grid[i][j];
            }
        }
        return dp[line-1];
    }

    public static void main(String[] args) {
        Solution47 t=new Solution47();
        int[][] grid={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(t.maxValue(grid));
    }
}
