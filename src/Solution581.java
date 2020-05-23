
/**
 * @author Arthas
 */
public class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        int l = length - 1;
        int r = 0;
        int max = nums[0];
        int min = nums[length-1];
        for (int i = 0;i < length;i++) {
            max = Math.max(nums[i],max);
            min = Math.min(nums[length-i-1],min);
            if (nums[i] < max) {
                r = i;
            }
            if (nums[length-i-1] > min) {
                l = length-i-1;
            }
        }
        if (l >= r) {
            return 0;
        }
        return r-l+1;
    }

    public static void main(String[] args) {
        Solution581 t=new Solution581();
        int[] nums={2,6,4,8,10,9,15};
        System.out.println(t.findUnsortedSubarray(nums));
    }
}
