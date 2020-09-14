import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/14
 * @time: 17:24
 */
public class Solution77 {
    private List<List<Integer>> res;
    private int maxNum;
    private int totalNum;

    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        maxNum = n;
        totalNum = k;
        if (n < 1 || k < 1) {
            return res;
        }
        List<Integer> temp = new ArrayList<>();
        dfs(temp, 1);
        return res;
    }

    private void dfs(List<Integer> temp, int index) {
        if (temp.size() == totalNum) {
            res.add(new ArrayList<>(temp));
            return;
        }
        if ((maxNum - index + 1) < totalNum - temp.size()) {
            return;
        }

        for (int i = index; i < maxNum + 1; i++) {
            temp.add(i);
            dfs(temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
