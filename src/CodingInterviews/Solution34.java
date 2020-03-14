package CodingInterviews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution34 {
    List<List<Integer>> res;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        res=new ArrayList<>();
        dfs(root,sum,new ArrayList<>());
        return res;
    }

    private void dfs(TreeNode node,int sum,List<Integer> temp){
        if (node == null) {
            return;
        }
        temp.add(node.val);
        sum-=node.val;
        if (sum == 0 && node.left == null && node.right == null) {
            res.add(new ArrayList<>(temp));
        } else {
            dfs(node.left, sum,temp);
            dfs(node.right, sum,temp);
        }
        temp.remove(temp.size()-1);
    }
}
