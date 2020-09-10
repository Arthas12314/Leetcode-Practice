/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/9
 * @time: 17:07
 */
public class Solution55 {
    /**
     * 贪心
     *
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int maxPosition = 0;
        for (int i = 0; i < len; i++) {
            if (maxPosition >= i) {
                maxPosition = Math.max(nums[i] + i, maxPosition);
                if (maxPosition >= len - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @param nums
     * @return
     */
    public boolean canJump2(int[] nums) {
        int len = nums.length;
        int count = 1;
        for (int i = len - 2; i >= 0; i--) {
            count = nums[i] >= count ? 1 : count + 1;
        }
        return count <= 1;
    }
}
