

public class Solution1022 {
    private long sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        preOrder(root, 0, 0);
        return (int) sum;
    }

    private void preOrder(TreeNode treeNode, int level, int temp) {
        if (treeNode == null) {
            return;
        }
        temp = ((temp << 1) + treeNode.val);
        if (treeNode.left == null && treeNode.right == null) {
            sum += temp;
        }
        preOrder(treeNode.left, level + 1, temp);
        preOrder(treeNode.right, level + 1, temp);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left = new TreeNode(0);
        Solution1022 t = new Solution1022();
        t.sumRootToLeaf(root);
    }
}
