import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/7
 * @time: 15:22
 */
public class Solution47 {
    private List<List<Integer>> result;

    public List<List<Integer>> permuteUnique(int[] nums) {
        result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        permuteUnique(nums, visited, temp);
        return result;
    }

    private void permuteUnique(int[] nums, boolean[] visited, List<Integer> temp) {
        int length = nums.length;
        if (temp.size() == length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < length; i++) {
            if (!visited[i]) {
                if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                    continue;
                }
                visited[i] = true;
                temp.add(nums[i]);
                permuteUnique(nums, visited, temp);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}
