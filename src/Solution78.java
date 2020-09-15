import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/15
 * @time: 0:34
 */
public class Solution78 {
    private List<List<Integer>> res;
    private int total;

    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        total = nums.length;
        List<Integer> temp = new ArrayList<>();
        findSubsets(nums, temp, 0);
        return res;
    }

    private void findSubsets(int[] nums, List<Integer> temp, int index) {
        res.add(new ArrayList<>(temp));
        for (int i = index; i < total; i++) {
            temp.add(nums[i]);
            findSubsets(nums, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
