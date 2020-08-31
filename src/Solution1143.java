/**
 * @author Arthas
 */
public class Solution1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int length1 = text1.length();
        int length2 = text2.length();
        int[][] dp = new int[length1 + 1][length2 + 1];
        for (int i = 1; i < length1 + 1; i++) {
            for (int j = 1; j < length2 + 1; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j]);
                dp[i][j] = Math.max(dp[i][j - 1], dp[i][j]);
            }
        }
        return dp[length1][length2];
    }

    public static void main(String[] args) {
        Solution1143 t = new Solution1143();
        System.out.println(t.longestCommonSubsequence("psnw", "vozsh"));
    }
}
