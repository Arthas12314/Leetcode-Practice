package CodingInterviews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * @author Arthas
 */
public class Solution37 {
    /**
     *  Encodes a tree to a single string.
     * @param root
     * @return
     */
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder data=new StringBuilder("[");
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node=queue.peek();
            queue.remove();
            if (node != null) {
                data.append(node.val);
                queue.add(node.left);
                queue.add(node.right);
            } else {
                data.append("null");
            }
            data.append(",");
        }
        data.deleteCharAt(data.length()-1);
        data.append("]");
        return data.toString();
    }


    /**
     * Decodes your encoded data to tree.
     * @param data
     * @return
     */
    public TreeNode deserialize(String data) {
        if (data == null || data.length() < 1) {
            return null;
        }
        data=data.substring(1,data.length()-1);
        String[] res=data.toString().split(",");
        int index=0;
        TreeNode root=buildNode(res[index++]);
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node=queue.remove();
            node.left=buildNode(res[index++]);
            node.right=buildNode(res[index++]);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return root;
    }

    private TreeNode buildNode(String data) {
        if ("null".equals(data)) {
            return null;
        }
        return new TreeNode(Integer.parseInt(data));
    }
}
