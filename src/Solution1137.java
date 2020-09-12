/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/12
 * @time: 21:38
 */
public class Solution1137 {
    public int tribonacci(int n) {
        if (n < 2) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        int first = 0;
        int second = 1;
        int third = 1;
        int res = 0;
        for (int i = 0; i < n - 2; i++) {
            res = first + second + third;
            first = second;
            second = third;
            third = res;
        }
        return res;
    }
}
