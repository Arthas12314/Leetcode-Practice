package codinginterviews;

public class Solution10_2 {
    public int numWays(int n) {
        if (n < 2) {
            return 1;
        }
        int first=1,second=1,sum=0;
        for(int i=0;i<n-1;i++){
            sum=(first+second)%1000000007;
            first=second%1000000007;
            second=sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution10_2 t=new Solution10_2();
        System.out.println(t.numWays(7));
    }
}
