import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/22
 * @time: 22:15
 */
public class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        boolean mark = false;
        int len;
        queue.add(root);
        while (!queue.isEmpty()) {
            len = queue.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                if (mark) {
                    temp.addFirst(node.val);
                } else {
                    temp.addLast(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(temp);
            mark = !mark;
        }
        return res;
    }
}
