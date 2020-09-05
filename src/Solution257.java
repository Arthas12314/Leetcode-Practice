import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/4
 * @time: 21:53
 */
public class Solution257 {
    private List<String> result;

    public List<String> binaryTreePaths(TreeNode root) {
        result = new ArrayList<>();
        if (root != null) {
            dfs(root, new StringBuilder());
        }
        return result;
    }

    private void dfs(TreeNode root, StringBuilder temp) {
        if (root.right == null && root.left == null) {
            result.add(temp.append(root.val).toString());
            return;
        }
        int lastLength;
        if (root.right != null) {
            lastLength = temp.length();
            dfs(root.right, temp.append(root.val).append("->"));
            temp.delete(lastLength, temp.length());
        }
        if (root.left != null) {
            lastLength = temp.length();
            dfs(root.left, temp.append(root.val).append("->"));
            temp.delete(lastLength, temp.length());
        }
    }
}
