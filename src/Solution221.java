
/**
 * @author Arthas
 */
public class Solution221 {
    public int maximalSquare(char[][] matrix) {
        int lines=matrix.length;
        if (lines < 1) {
            return 0;
        }
        int rows=matrix[0].length;
        int max=0;
        int[][] dp=new int[lines+1][rows+1];
        for (int i = 1; i < lines+1; i++) {
            for (int j = 1; j < rows+1; j++) {
                if (matrix[i-1][j-1] == '1') {
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                    max=Math.max(dp[i][j],max);
                }
            }
        }
        return max*max;
    }

    public static void main(String[] args) {
        Solution221 t=new Solution221();
        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','1','1','1'}};
        System.out.println(t.maximalSquare(matrix));
    }
}
