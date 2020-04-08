package codinginterviews;

import java.util.Arrays;

public class Solution61 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for (int i = 0;i<nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else if (i < nums.length - 1 && nums[i + 1] - nums[i] > 1) {
                count -= (nums[i + 1] - nums[i]-1);
            } else if (i < nums.length - 1 && nums[i] == nums[i + 1] ) {
                return false;
            }
        }
        return count>=0;
    }

    public static void main(String[] args) {
        Solution61 t=new Solution61();
        int[] nums={0,0,1,2,5};
        System.out.println(t.isStraight(nums));
    }
}
