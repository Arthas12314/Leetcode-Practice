package coding.interviews;


/**
 * @author Arthas
 */
public class Solution3 {
    public int findRepeatNumber(int[] nums) {
        int[] countNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            countNums[nums[i]]++;
            if (countNums[nums[i]] > 1) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution3 t = new Solution3();
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(t.findRepeatNumber(nums));
    }
}
