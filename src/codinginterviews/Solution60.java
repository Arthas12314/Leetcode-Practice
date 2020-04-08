package codinginterviews;

public class Solution60 {
    public double[] twoSum(int n) {
        double[] dp=new double[6*n+1];
        dp[0]=1;
        for (int i = 1; i <= n; i++) {
            for (int j = i * 6; j >= i; j--) {
                dp[j]=0;
                for (int k = i - 1; k < j && k < (i - 1) * 6; k++) {
                    if (j - k <= 6) {
                        dp[j]+=dp[k]*1.0/6;
                    }
                }
            }
        }
        double[] res=new double[5*n-1];
        for (int i = 0; i < res.length; i++) {
            res[0]=dp[i+n];
        }
        return res;
        /*double[] pd = new double[n * 6 + 1];
        pd[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i * 6; j >= i; j--) {
                pd[j] = 0;
                for (int k = i - 1; k < j && k <= (i - 1) * 6; k++) {
                    if (j - k <= 6) {
                        pd[j] += pd[k] * 1.0 / 6;
                    }
                }
            }
        }
        double[] ans = new double[n * 6 - n + 1];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = pd[i + n];
        }

        return ans;*/
    }
}
