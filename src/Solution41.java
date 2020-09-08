/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/6
 * @time: 15:44
 */
public class Solution41 {
    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            while (nums[i] > 0 && nums[i] <= length && nums[nums[i] - 1] != nums[i]) {
                swap(nums, nums[i] - 1, i);
            }
        }

        for (int i = 0; i < length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return length + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
