import java.util.LinkedList;
import java.util.List;

public class Solution95 {
    public List<TreeNode> generateTrees(int n) {
        if(n<1)    return new LinkedList<>();
        return generate(1,n);
    }
    private List<TreeNode> generate(int l,int r){
        List<TreeNode> res=new LinkedList<>();
        if(l>r){
            res.add(null);
            return res;
        }
        for(int i=l;i<=r;i++){
            List<TreeNode> leftTrees=generate(l,i-1);
            List<TreeNode> rightTrees=generate(i+1,r);
            for(TreeNode left:leftTrees){
                for(TreeNode right:rightTrees){
                    TreeNode temp=new TreeNode(i);
                    temp.left=left;
                    temp.right=right;
                    res.add(temp);
                }
            }
        }
        return res;
    }
}
