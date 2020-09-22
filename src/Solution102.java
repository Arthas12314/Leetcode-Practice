import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution102 {
    public static void main(String[] args) {
        Solution102 t = new Solution102();
        Integer[] a = {3, 9, 20, null, null, 15, 7};
        TreeNode root = (new BuildCompleteBinaryTree(a)).generate();
        List<List<Integer>> res = t.levelOrder(root);
        System.out.println(res);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int len = q.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < len; i++) {
                TreeNode temp = q.remove();
                list.add(temp.val);
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
