
/**
 * @author Arthas
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int[] res = {-1, -1};
        if (r < 0) {
            return new int[]{};
        }
        while (l < r) {
            int mid = l + ((r - l) >> 2);
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        if (nums[l] != target) {
            return res;
        }
        res[0] = l;
        r = nums.length - 1;
        while (l < r) {
            int mid = (r - l) >> 2 + l;
            if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        res[1] = r;
        return res;
    }
}
