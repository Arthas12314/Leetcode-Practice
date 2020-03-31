package codinginterviews;

public class Solution16 {
    public double myPow(double x, int n) {
        int mark=n;
        double res=1;
        while(n!=0){
            if ((n & 1) != 0) {
                res *= x;
            }
            x *= x;
            n /= 2;
        }
        return mark<0?1.0/res:res;
    }

    public static void main(String[] args) {
        Solution16 t=new Solution16();
        System.out.println(t.myPow(0.00001,2147483647));
    }
}
