/**
 * @author Arthas
 */
public class Solution538 {
    private int num = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            num += root.val;
            root.val = num;
            convertBST(root.left);
        }
        return root;
    }
}
