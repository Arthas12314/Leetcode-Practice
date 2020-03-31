package codinginterviews;

/**
 * @author Arthas
 */
public class Solution57_1 {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while (i < j) {
            int temp=nums[i]+nums[j];
            if (temp>target) {
                j--;
            } else if (temp < target) {
                i++;
            } else {
                return new int[]{nums[i],nums[j]};
            }
        }
        return new int[]{};
    }
}
