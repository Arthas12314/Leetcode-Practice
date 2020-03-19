package CodingInterviews;

import java.util.Map;

/**
 * @author Arthas
 */
public class Solution42 {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,sum=0;
        for (int num : nums) {
            if (sum < 0) {
                sum = num;
            } else {
                sum+=num;
            }
            max= Math.max(sum,max);
        }
        return max;
    }
}
