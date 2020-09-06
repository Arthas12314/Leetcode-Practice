import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/5
 * @time: 22:57
 */
public class Solution40 {
    private List<List<Integer>> res;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, stack);
        return res;
    }

    private void dfs(int[] candidates, int target, int index, Stack<Integer> stack) {
        if (target == 0) {
            res.add(new ArrayList<>(stack));
        }

        for (int i = index; i < candidates.length && target >= candidates[i]; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            stack.push(candidates[i]);
            dfs(candidates, target - candidates[i], i + 1, stack);
            stack.pop();
        }
    }
}
