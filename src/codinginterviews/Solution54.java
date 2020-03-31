package codinginterviews;

/**
 * @author Arthas
 */
public class Solution54 {
    private int count=0,res=0;
    public int kthLargest(TreeNode root, int k) {
        helper(root,k);
        return res;
    }

    private void helper(TreeNode node,int k){
        if (node == null) {
            return;
        }
        helper(node.right, k );
        if (++count == k) {
            res=node.val;
        }
        helper(node.left,k);
    }
}
