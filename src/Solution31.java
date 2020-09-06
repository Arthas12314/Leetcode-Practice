import java.util.Arrays;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/5
 * @time: 15:18
 */
public class Solution31 {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        boolean isAllDesc = true;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                isAllDesc = false;
                int j = nums.length - 1;
                while (nums[j] <= nums[i]) {
                    j--;
                }
                swap(nums, i, j);
                Arrays.sort(nums, i + 1, nums.length);
                break;
            }
        }
        if (isAllDesc) {
            Arrays.sort(nums);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Solution31 t = new Solution31();
        int[] nums = {1, 3, 2};
        t.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
