import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/19
 * @time: 11:52
 */
public class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root == null) {
            return sum;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                    if (node.left.left == null && node.left.right == null) {
                        sum += node.left.val;
                    }
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return sum;
    }

    public int sumOfLeftLeaves2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves2(root.right);
        }
        return sumOfLeftLeaves2(root.left) + sumOfLeftLeaves2(root.right);
    }
}
