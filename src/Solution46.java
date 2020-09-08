import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/7
 * @time: 15:11
 */
public class Solution46 {
    private List<List<Integer>> result;

    public static void main(String[] args) {
        Solution46 t = new Solution46();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = t.permute(nums);
        System.out.println(result);
    }

    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        if (nums.length < 1) {
            return result;
        }
        boolean[] visited = new boolean[nums.length];
        List<Integer> temp = new ArrayList<>();
        dfs(nums, visited, temp);
        return result;
    }

    private void dfs(int[] nums, boolean[] visited, List<Integer> temp) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp.add(nums[i]);
                dfs(nums, visited, temp);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}
