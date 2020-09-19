class Solution283 {
    public void moveZeroes(int[] nums) {
        int len = nums.length, j = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    swap(nums, i, j);
                }
                j++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}