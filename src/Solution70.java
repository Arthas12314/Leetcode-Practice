/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/12
 * @time: 15:59
 */
public class Solution70 {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }

        int firstStep = 1;
        int secondStep = 1;
        int methodNum = 0;
        for (int i = 0; i < n - 1; i++) {
            methodNum = firstStep + secondStep;
            firstStep = secondStep;
            secondStep = methodNum;
        }
        return methodNum;
    }
}
