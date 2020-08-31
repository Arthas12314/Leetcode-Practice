
/**
 * @author Arthas
 */
public class Solution230 {
    private int result = -1;
    private int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return result;
    }

    private void inOrder(TreeNode node, int k) {
        if (node == null) {
            return;
        }
        inOrder(node.left, k);
        count++;
        if (count == k) {
            result = node.val;
        }
        inOrder(node.right, k);
    }

    private int n = 1;

    public int kthSmallest2(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }

        int left = kthSmallest2(root.left, k);
        if (left != -1) {
            return left;
        }

        if (k == n) {
            return root.val;
        }
        n++;

        int right = kthSmallest2(root.right, k);
        if (right != -1) {
            return right;
        }

        return -1;
    }
}
