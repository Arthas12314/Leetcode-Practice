import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Arthas
 */
public class Solution95 {

    public List<TreeNode> generateTrees(int n) {
        if (n < 1) {
            return new LinkedList<>();
        }
        return generate(1, n);
    }

    private List<TreeNode> generate(int left, int right) {
        List<TreeNode> res = new ArrayList<>();
        if (left > right) {
            res.add(null);
            return res;
        }
        if (left == right) {
            TreeNode node = new TreeNode(left);
            res.add(node);
            return res;
        }
        for (int i = left; i <= right; i++) {
            List<TreeNode> leftTrees = generate(left, i);
            List<TreeNode> rightTrees = generate(i, right);
            for (TreeNode leftNode : leftTrees) {
                for (TreeNode rightNode : rightTrees) {
                    TreeNode node = new TreeNode(i);
                    node.left = leftNode;
                    node.right = rightNode;
                    res.add(node);
                }
            }
        }
        return res;
    }
}
