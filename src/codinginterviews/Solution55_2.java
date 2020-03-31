package codinginterviews;

/**
 * @author Arthas
 */
public class Solution55_2 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1) {
            return false;
        }
        return isBalanced(root.right) && isBalanced(root.left);
    }

    private int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDepth=maxDepth(node.left)+1;
        int rightDepth=maxDepth(node.right)+1;
        return Math.max(leftDepth,rightDepth);
    }
}
