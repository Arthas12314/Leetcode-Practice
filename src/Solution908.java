public class Solution908 {
    public int smallestRangeI(int[] nums, int k) {
        if (nums.length < 2) {
            return 0;
        }
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return max - min > 2 * k ? max - min - 2 * k : 0;
    }
}
