
/**
 * @author Arthas
 */
public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0, cur = 1; i < len; i++) {
            res[i] = cur;
            cur *= nums[i];
        }
        for (int i = len - 1, cur = 1; i >= 0; i--) {
            res[i] *= cur;
            cur *= nums[i];
        }
        return res;
    }
}
