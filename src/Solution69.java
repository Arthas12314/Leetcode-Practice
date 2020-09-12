/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/12
 * @time: 15:45
 */
public class Solution69 {
    public static void main(String[] args) {
        Solution69 t = new Solution69();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(t.mySqrt(Integer.MAX_VALUE));
    }

    public int mySqrt(int x) {
        long left = 0;
        long right = x;
        while (left < right) {
            long mid = (right + left + 1) >>> 1;
            if (mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int) left;
    }
}
