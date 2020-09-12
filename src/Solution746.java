/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/12
 * @time: 16:06
 */
public class Solution746 {
    public static void main(String[] args) {
        Solution746 t = new Solution746();
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(t.minCostClimbingStairs(cost));
    }

    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if (len < 3) {
            return 0;
        }
        int[] dp = new int[len + 1];
        for (int i = 2; i < len + 1; i++) {
            dp[i] = Math.min(cost[i - 2] + dp[i - 2], cost[i - 1] + dp[i - 1]);
        }
        return dp[len];
    }
}
