package codinginterviews;

public class Solution14_1 {
    public int cuttingRope(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int sum=1;
        while (n>4){
            sum*=3;
            n-=3;
        }
        return sum*n;
    }

    public static void main(String[] args) {
        Solution14_1 t=new Solution14_1();
        System.out.println(t.cuttingRope(10));
    }
}
