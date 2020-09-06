/**
 * @author Arthas
 */
public class Solution33 {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            /*精彩的异或简化
            if((nums[0] > target) ^ (nums[0] > nums[mid]) ^ (target > nums[mid])){
                l=mid+1;
            }*/
            if ((nums[mid] >= nums[0] && nums[mid] >= target && target >= nums[0])
                    || (nums[mid] < nums[0] && nums[mid] <= target && target >= nums[0])
                    || (nums[mid] < nums[0] && nums[mid] >= target && target <= nums[0])) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l == r && nums[l] == target ? l : -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3};
        Solution33 t = new Solution33();
        System.out.println(t.search(nums, 3));
    }
}
