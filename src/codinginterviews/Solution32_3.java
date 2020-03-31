package codinginterviews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res=new ArrayList<>();
            if(root==null){
                return res;
            }
            LinkedList<Integer> temp=new LinkedList<>();
            Queue<TreeNode> queue=new LinkedList<>();
            queue.add(root);
            boolean mark=false;
            while (!queue.isEmpty()){
                int len=queue.size();
                if (mark) {
                    for(int i=0;i<len;i++){
                        TreeNode node=queue.remove();
                        temp.addFirst(node.val);
                        if (node.left != null) {
                            queue.add(node.left);
                        }
                        if (node.right != null) {
                            queue.add(node.right);
                        }
                    }
                    mark= false;
                } else {
                    for(int i=0;i<len;i++){
                        TreeNode node=queue.remove();
                        temp.addLast(node.val);
                        if (node.left != null) {
                            queue.add(node.left);
                        }
                        if (node.right != null) {
                            queue.add(node.right);
                        }
                    }
                    mark= true;
                }
                res.add(new ArrayList<>(temp));
                temp.clear();
            }
            return res;
    }
}
