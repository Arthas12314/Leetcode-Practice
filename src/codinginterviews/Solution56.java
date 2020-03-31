package codinginterviews;

/**
 * @author Arthas
 */
public class Solution56 {
    public int[] singleNumbers(int[] nums) {
        int[] res=new int[2];
        int temp=0;
        for (int value : nums) {
            temp ^= value;
        }
        temp&=(-temp);
        for (int num : nums) {
            if ((temp & num) == 0) {
                res[0] ^= num;
            } else {
                res[1] ^= num;
            }
        }
        return res;
    }
}
