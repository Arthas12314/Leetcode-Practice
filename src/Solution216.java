import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/11
 * @time: 17:38
 */
public class Solution216 {
    private List<List<Integer>> res;

    public static void main(String[] args) {
        Solution216 t = new Solution216();
        System.out.println(t.combinationSum3(3, 9));
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        res = new ArrayList<>();
        if (k < 1) {
            return res;
        }
        List<Integer> temp = new ArrayList<>();
        dfs(temp, 1, n, k);
        return res;
    }

    private void dfs(List<Integer> temp, int index, int target, int num) {
        if (num == 0 && target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < 10 && target >= i; i++) {
            temp.add(i);
            dfs(temp, i + 1, target - i, num - 1);
            temp.remove(temp.size() - 1);
        }
    }
}
