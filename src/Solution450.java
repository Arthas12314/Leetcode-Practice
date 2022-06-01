
// TODO
public class Solution450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root.val == key?null:root;
        }
        if (root.val > key) {
            root.left = deleteNode(root.left,key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            TreeNode res = root.left;
            if (res == null) {
                return root.right;
            }
            TreeNode cur = res;
            while (cur.right != null) {
                cur = cur.right;
            }
            cur.right = root.right;
            return res;
        }
        return root;
    }
}
