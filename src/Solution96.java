/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/20
 * @time: 18:10
 */
public class Solution96 {
    /**
     * 动态规划
     *
     * @param n
     * @return
     */
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                dp[i] += dp[j - 1] + dp[i - j];
            }
        }
        return dp[n];
    }

    /**
     * 卡特兰数
     *
     * @param n
     * @return
     */
    public int numTrees2(int n) {
        long res = 1;
        for (int i = 0; i < n; i++) {
            res *= 2 * (2 * i + 1) * (i + 2);
        }
        return (int) res;
    }
}
