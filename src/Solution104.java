/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/22
 * @time: 22:40
 */
public class Solution104 {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
