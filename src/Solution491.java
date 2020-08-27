import java.util.ArrayList;
import java.util.List;

/**
 * @author Arthas
 */
public class Solution491 {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> tmp = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        dfs(nums, 0, Integer.MIN_VALUE);

        return ans;
    }

    /**
     * 1.前一个选择的数和当前数不同
     * ① 如果当前数大于或等于前一个选择的数，选择当前数
     * ② 不选择当前数
     * 2.前一个选择的数和当前数相同
     * ① 选择当前数
     * ② 不选择当前数（可以省略，因为，前一个选择后一个不选择的结果与前一个不选择后一个选择的情况相同）
     * 所以，这个问题中出现重复解的原因就是 2.②
     */
    private void dfs(int[] nums, int index, int lastVal) {
        if (index >= nums.length) {
            if (tmp.size() > 1) {
                ans.add(new ArrayList<>(tmp));
            }
            return;
        }

        //选择当前数
        //剪枝，当前数需要比前一个选择的数大或等于
        if (nums[index] >= lastVal) {
            tmp.add(nums[index]);
            dfs(nums, index + 1, nums[index]);
            //回溯
            tmp.remove(tmp.size() - 1);
        }
        //不选择当前数
        //去重，如果前一个选择的数和当前的数相同，可以不用考虑这次不选择的情况
        if (lastVal != nums[index]) {
            dfs(nums, index + 1, lastVal);
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 6, 7, 7};
        Solution491 t = new Solution491();
        System.out.println(t.findSubsequences(nums));
    }
}
