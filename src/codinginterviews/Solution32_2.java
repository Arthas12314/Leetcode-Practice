package codinginterviews;

import java.util.ArrayList;
import java.util.List;

public class Solution32_2 {
    /*public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new LinkedList<>();
        if(root==null){
            return res;
        }
        List<Integer> temp=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int len=queue.size();
            for(int i=0;i<len;i++){
                TreeNode node=queue.remove();
                temp.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(new LinkedList<>(temp));
            temp.clear();
        }
        return res;
    }*/
    /**
     * 递归
     */
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return res;
        }
        helper(root,0);
        return res;
    }
    private void helper(TreeNode root,int level){
        if(root!=null){
            if(res.size()==level){
                List<Integer> layer = new ArrayList<>();
                layer.add(root.val);
                res.add(layer);
            }else{
                res.get(level).add(root.val);
            }
            helper(root.left,level+1);
            helper(root.right,level+1);
        }
    }
}
