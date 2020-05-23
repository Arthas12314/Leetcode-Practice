
/**
 * @author Arthas
 */
public class Solution543 {
    private int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }

    private int dfs(TreeNode root){
        if (root == null) {
            return 0;
        }
        int leftDepth = dfs(root.left);
        int rightDepth = dfs(root.right);
        res=Math.max(res,leftDepth+rightDepth);
        return Math.max(leftDepth,rightDepth)+1;
    }
}
