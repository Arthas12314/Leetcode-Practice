import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/3
 * @time: 13:30
 */
public class Solution22 {
    private List<String> res = new ArrayList<>();
    private int total = 0;

    public List<String> generateParenthesis(int n) {
        total = n;
        dfs(0, 0, "");
        return res;
    }

    private void dfs(int leftParenthesis, int rightParenthesis, String temp) {
        if (leftParenthesis == total && rightParenthesis == total) {
            res.add(temp);
            return;
        }
        if (leftParenthesis < total) {
            dfs(leftParenthesis + 1, rightParenthesis, temp + '(');
        }
        if (rightParenthesis < total && leftParenthesis > rightParenthesis) {
            dfs(leftParenthesis, rightParenthesis + 1, temp + ')');
        }
    }
}
