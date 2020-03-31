package codinginterviews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution32_1 {
    public int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[]{};
        }
        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int len=queue.size();
            for(int i=0;i<len;i++){
                TreeNode temp=queue.remove();
                list.add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
