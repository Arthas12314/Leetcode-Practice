
/**
 * @author Arthas
 */
public class Solution437 {
    private int count = 0;

    public int pathSum(TreeNode root, int sum) {
        inOrder(root, sum);
        return count;
    }

    private void inOrder(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        dfs(root, sum);
        inOrder(root.left, sum);
        inOrder(root.right, sum);
    }

    private void dfs(TreeNode node, int sum) {
        if (node == null) {
            return;
        }
        if (sum == node.val) {
            count++;
        }
        dfs(node.left, sum - node.val);
        dfs(node.right, sum - node.val);
    }
}
