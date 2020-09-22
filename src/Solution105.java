import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Solution105 {
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        Solution105 t = new Solution105();
        TreeNode root = t.buildTree(preorder, inorder);
        Solution102 t2 = new Solution102();
        List<List<Integer>> res = t2.levelOrder(root);
        System.out.println(res);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length < 1) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode cur = root;
        Deque<TreeNode> deque = new ArrayDeque<>();
        int preOrderIndex = 1;
        int inOrderIndex = 0;
        deque.add(root);
        while (preOrderIndex < preorder.length) {
            if (cur.val == inorder[inOrderIndex]) {
                while (!deque.isEmpty() && deque.getLast().val == inorder[inOrderIndex]) {
                    cur = deque.removeLast();
                    inOrderIndex++;
                }
                cur.right = new TreeNode(preorder[preOrderIndex++]);
                cur = cur.right;
                deque.add(cur);
            } else {
                cur.left = new TreeNode(preorder[preOrderIndex++]);
                cur = cur.left;
                deque.add(cur);
            }
        }
        return root;
    }
}
