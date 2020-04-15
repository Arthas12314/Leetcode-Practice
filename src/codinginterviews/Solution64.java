package codinginterviews;

/**
 * @author Arthas
 */
public class Solution64 {
    public int sumNums(int n) {
        int sum=n;
        boolean flag=n>0 && (sum+=sumNums(n-1))>0;
        return sum;
    }

    public static void main(String[] args) {
        Solution64 t=new Solution64();
        System.out.println(t.sumNums(9));
    }
}
