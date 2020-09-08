/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/5
 * @time: 23:15
 */
public class Solution42 {
    /**
     * 暴力
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int res = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int leftMax = 0;
            int rightMax = 0;
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            res += Math.min(leftMax, rightMax) - height[i];
        }
        return res;
    }

    /**
     * 双指针
     *
     * @param height
     * @return
     */
    public int trap2(int[] height) {
        int res = 0, leftMax = 0, rightMax = 0, left = 0, right = height.length - 1;
        while (left <= right) {
            if (leftMax <= rightMax) {
                leftMax = Math.max(leftMax, height[left]);
                res += leftMax - height[left++];
            } else {
                rightMax = Math.max(rightMax, height[rightMax]);
                res += rightMax - height[right--];
            }
        }
        return res;
    }
}
