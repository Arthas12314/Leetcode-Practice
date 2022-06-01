import java.util.ArrayList;
import java.util.List;

public class Solution1305 {
    private List<Integer> result;
    private TreeNode unfinishedNode;
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        result = new ArrayList<>();
        inOrderTwo(root1,root2);
        inOrder(unfinishedNode);
        return result;
    }

    private void inOrderTwo(TreeNode root1,TreeNode root2){
        if(root1 == null || root2 == null){
            unfinishedNode = root1 == null ? root2:root1;
            return;
        }
        inOrderTwo(root1.left,root2.left);
        if(root1.val<=root2.val){
            result.add(root1.val);
            inOrderTwo(root1.right,root2);
        }else{
            result.add(root2.val);
            inOrderTwo(root1,root2.right);
        }
    }

    private void inOrder(TreeNode node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        result.add(node.val);
        inOrder(node.right);
    }
}
