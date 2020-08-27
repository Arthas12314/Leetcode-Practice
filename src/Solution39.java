import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author Arthas
 */
public class Solution39 {
    private List<List<Integer>> result;
    private Stack<Integer> stack = new Stack<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        if (candidates.length < 1) {
            return result;
        }
        Arrays.sort(candidates);
        return result;
    }

    private void dfs(int[] candidates, int target, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(stack));
            return;
        }
        for (int i = index; i < candidates.length && candidates[i] <= target; i++) {
            stack.push(candidates[i]);
            dfs(candidates, target - candidates[i], i);
            stack.pop();
        }
    }
}
