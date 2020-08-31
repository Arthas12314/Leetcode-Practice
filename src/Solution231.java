
/**
 * @author Arthas
 */
public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && 2147483648L % n == 0;
    }

    public static void main(String[] args) {
        Solution231 t = new Solution231();
        System.out.println(t.isPowerOfTwo((int) (Math.pow(2, 30))));
    }
}
