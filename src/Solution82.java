/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/17
 * @time: 16:25
 */
public class Solution82 {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            while (l < r && nums[l] == nums[l + 1]) {
                l++;
            }
            while (l < r && nums[r] == nums[r - 1]) {
                r--;
            }

            int mid = ((r - l) >> 1) + l;
            if ((nums[0] <= target && nums[0] <= nums[mid] && nums[mid] >= target)
                    || (target <= nums[mid] && target <= nums[0] && nums[mid] < nums[0])
                    || (nums[mid] < nums[0] && nums[0] <= target && nums[mid] <= target)) {
                r = mid;
            } else if (nums[mid] == target) {
                return true;
            } else {
                l = mid + 1;
            }
        }
        return l == r && nums[l] == target;
    }
}
