/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/18
 * @time: 11:43
 */
public class Solution91 {
    public int numDecodings(String s) {
        if (s.length() < 1) {
            return 0;
        }
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for (int i = 0; i < s.length(); i++) {
            dp[i + 1] = s.charAt(i) == '0' ? 0 : dp[i];
            if (i > 0 && (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) < '7'))) {
                dp[i + 1] += dp[i - 1];
            }
        }
        return dp[s.length()];
    }
}
