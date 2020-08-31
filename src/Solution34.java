import java.util.Arrays;

/**
 * @author Arthas
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if (nums == null || nums.length < 1) {
            return res;
        }
        int l = 0;
        int r = nums.length - 1;
        int mid;
        while (l < r) {
            mid = (r - l) / 2 + l;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        res[0] = l;
        r = nums.length - 1;
        while (l < r) {
            mid = (r - l + 1) / 2 + l;
            if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        res[1] = r;
        return res;
    }

    public static void main(String[] args) {
        Solution34 t = new Solution34();
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(t.searchRange(nums, 8)));
    }
}
