import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/10/8
 * @time: 19:30
 */
public class Solution106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length < 1) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        TreeNode cur = root;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        int postOrderIndex = postorder.length - 2;
        int inOrderIndex = inorder.length - 1;
        while (postOrderIndex >= 0) {
            TreeNode back = null;
            cur = new TreeNode(postorder[postOrderIndex]);
            while (!deque.isEmpty() && deque.peek().val == inorder[inOrderIndex]) {
                back = deque.poll();
                inOrderIndex--;
            }
            if (back != null) {
                back.left = cur;
            } else {
                deque.peek().right = cur;
            }
            deque.push(cur);
            postOrderIndex--;
        }
        return root;
    }
}
