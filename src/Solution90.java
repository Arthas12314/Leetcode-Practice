import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/18
 * @time: 11:27
 */
public class Solution90 {
    private List<List<Integer>> res;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        if (nums.length < 1) {
            return res;
        }
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        findSubset(nums, temp, 0);
        return res;
    }

    private void findSubset(int[] nums, List<Integer> temp, int index) {
        res.add(new ArrayList<>(temp));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            temp.add(nums[i]);
            findSubset(nums, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
