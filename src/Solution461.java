
/**
 * @author Arthas
 */
public class Solution461 {
    public int hammingDistance(int x, int y) {
        int num=x^y;
        int res=0;
        while (num != 0) {
            num&=num-1;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution461 t=new Solution461();
        System.out.println(t.hammingDistance(1,4));
    }
}
