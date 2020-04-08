package codinginterviews;

/**
 * @author Arthas
 */
public class Solution56_2 {
    public int singleNumber(int[] nums) {
        int a=0,b=0;
        for (int num : nums) {
            a=(~a)&(b^num);
            b=(~b)&(a^num);
        }
        return b;
    }
}
