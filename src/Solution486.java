
/**
 * @author Arthas
 * TODO 未理解
 */
public class Solution486 {
    public boolean PredictTheWinner(int[] nums) {
        int len = nums.length;
        int[][] dp = new int[len][len];
        for (int k = 0; k < len; k++) {
            for (int i = 0, j = i + k; j < len; i++, j++) {
                if (k == 0) {
                    dp[i][j] = nums[i];
                } else {
                    dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
                }
            }
        }
        return dp[0][len - 1] >= 0;
    }

    public static void main(String[] args) {
        Solution486 t = new Solution486();
        int[] nums = {0, 0, 7, 6, 5, 6, 1};
        System.out.println(t.PredictTheWinner(nums));
    }
}