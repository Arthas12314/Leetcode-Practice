import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length<1)   return null;
        TreeNode root=new TreeNode(preorder[0]);
        TreeNode curRoot=root;
        LinkedList<TreeNode> list=new LinkedList<>();
        int pre=1,in=0;
        list.add(curRoot);
        while(pre<preorder.length){
            if (curRoot.val == inorder[in]) {
                while (!list.isEmpty() && list.getLast().val == inorder[in]) {
                    curRoot = list.removeLast();
                    in++;
                }
                curRoot.right = new TreeNode(preorder[pre++]);
                curRoot = curRoot.right;
                list.push(curRoot);
            } else {
                curRoot.left = new TreeNode(preorder[pre++]);
                curRoot = curRoot.left;
                list.addLast(curRoot);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int[] preorder={3,9,20,15,7};
        int[] inorder={9,3,15,20,7};
        Solution105 t=new Solution105();
        TreeNode root=t.buildTree(preorder,inorder);
        Solution102 t2=new Solution102();
        List<List<Integer>> res=t2.levelOrder(root);
        System.out.println(res);
    }
}
