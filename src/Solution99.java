/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/22
 * @time: 20:46
 */
public class Solution99 {
    private TreeNode node1;
    private TreeNode node2;
    private TreeNode pre;

    public void recoverTree(TreeNode root) {
        inOrder(root);
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        if (pre != null && pre.val > root.val) {
            if (node1 == null) {
                node1 = pre;
            }
            node2 = root;
        }
        pre = root;
        inOrder(root.right);
    }
}
