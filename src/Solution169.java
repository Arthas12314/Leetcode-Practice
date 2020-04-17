/**
 * @author Arthas
 */
public class Solution169 {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        int count=1,maxNum=nums[0];
        for (int i = 1; i < len; i++) {
            if (maxNum == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    maxNum = nums[i+1];
                }
            }
        }
        return maxNum;
    }
}
