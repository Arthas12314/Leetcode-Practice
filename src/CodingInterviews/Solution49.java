package CodingInterviews;

/**
 * @author Arthas
 */
public class Solution49 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int p2 = 0, p3 = 0, p5 = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(Math.min(2 * dp[p2], 3 * dp[p3]), 5 * dp[p5]);
            if (dp[i] >= 2 * dp[p2]) {
                p2++;
            }
            if (dp[i] >= 3 * dp[p3]) {
                p3++;
            }
            if (dp[i] >= 5 * dp[p5]) {
                p5++;
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        Solution49 t=new Solution49();
        System.out.println(t.nthUglyNumber(10));
    }
}
