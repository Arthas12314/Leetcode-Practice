/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/5
 * @time: 14:39
 */
public class Solution29 {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend ^ divisor) < 0;
        long dividendLong = Math.abs((long) dividend);
        long divisorLong = Math.abs((long) divisor);
        int result = 0;
        for (int i = 31; i >= 0; i--) {
            //找出足够大的数2^i*divisor
            if ((dividendLong >> i) >= divisorLong) {
                //将结果加上2^i
                result += (1 << i);
                //将被除数减去2^n*divisor
                dividendLong -= divisorLong << i;
            }
        }
        return negative ? -result : result;
    }
}
