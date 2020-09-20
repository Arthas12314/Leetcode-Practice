/**
 * @author Arthas
 */
public class Solution75 {
    public void sortColors(int[] nums) {
        int l = 0, i = 0, r = nums.length - 1;
        while (i <= r) {
            if (nums[i] == 0) {
                swap(nums, l++, i++);
            } else if (nums[i] == 2) {
                swap(nums, r--, i);
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
