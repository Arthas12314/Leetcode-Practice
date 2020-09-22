/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/22
 * @time: 21:53
 */
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode == null || rightNode == null || leftNode.val != rightNode.val) {
            return false;
        }
        return isSymmetric(leftNode.right, rightNode.left) && isSymmetric(leftNode.left, rightNode.right);
    }
}
