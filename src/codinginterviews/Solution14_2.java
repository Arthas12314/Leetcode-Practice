package codinginterviews;

public class Solution14_2 {
    public int cuttingRope(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        long sum=1;
        while (n>4){
            sum=(sum*3)%1000000007;
            n-=3;
        }
        return (int)(sum*n%1000000007);
    }

    public static void main(String[] args) {
        Solution14_2 t=new Solution14_2();
        System.out.println(t.cuttingRope(1000));
    }
}
