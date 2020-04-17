/**
 * @author Arthas
 */
public class Solution7 {
    public int reverse(int x) {
        int res=0,b;
        while (x != 0) {
            b=x%10;
            x/=10;
            if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && b > 7)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10 && b < -8)) {
                return 0;
            }
            res=10*res+b;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution7 t=new Solution7();
        System.out.println(t.reverse(Integer.MAX_VALUE-7));
    }
}
