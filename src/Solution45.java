/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/6
 * @time: 17:25
 */
public class Solution45 {
    public static void main(String[] args) {
        Solution45 t = new Solution45();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(t.jump(nums));
    }

    public int jump(int[] nums) {
        int length = nums.length;
        int maxPosition = 0;
        int end = 0;
        int result = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (end == i) {
                end = maxPosition;
                result++;
            }
        }
        return result;
    }
}
