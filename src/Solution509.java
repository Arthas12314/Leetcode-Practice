/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/12
 * @time: 18:04
 */
public class Solution509 {
    public int fib(int N) {
        if (N < 2) {
            return N;
        }
        int first = 0;
        int second = 1;
        int res = 0;
        for (int i = 0; i < N; i++) {
            res = first + second;
            first = second;
            second = res;
        }
        return res;
    }
}
