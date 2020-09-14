import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/14
 * @time: 16:00
 */
public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<TreeNode> temp = new LinkedList<>();
        TreeNode cur = root;
        while (cur != null || !temp.isEmpty()) {
            while (cur != null) {
                temp.add(cur);
                cur = cur.left;
            }
            cur = temp.remove(temp.size() - 1);
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}
