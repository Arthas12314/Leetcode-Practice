public class Solution80 {
    public static void main(String[] args) {
        int[] a = {0, 0, 0, 0, 0, 1, 2, 2, 3, 3, 4, 4};
        Solution80 t = new Solution80();
        int len = t.removeDuplicates(a);
        for (int i = 0; i < len; i++) {
            System.out.print(a[i]);
        }
    }

    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[j - 1] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return j;
    }
}
