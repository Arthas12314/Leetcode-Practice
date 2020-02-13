package CodingInterviews;

import java.util.LinkedList;
import java.util.Queue;

public class Solution07 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length<1)   return null;
        TreeNode root=new TreeNode(preorder[0]);
        TreeNode cur=root;
        LinkedList<TreeNode> temp=new LinkedList<>();

        int pre=1,in=0;
        temp.push(root);
        while(pre<preorder.length){
            //若相等，则寻找是哪个节点的右子树
            if(cur.val==inorder[in]){
                //找到辅助
                while(!temp.isEmpty() && temp.peek().val==inorder[in]){
                    cur=temp.pop();
                    in++;
                }
                cur.right=new TreeNode(preorder[pre++]);
                cur=cur.right;
            }
            else{
                cur.left=new TreeNode(preorder[pre++]);
                cur=cur.left;
            }
            temp.push(cur);
        }
        return root;

        //递归求解
        /*int n = preorder.length;
        if (n == 0)
            return null;
        int rootVal = preorder[0], rootIndex = 0;
        for (int i = 0; i < n; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + rootIndex), Arrays.copyOfRange(inorder, 0, rootIndex));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1 + rootIndex, n), Arrays.copyOfRange(inorder, rootIndex + 1, n));

        return root;*/
    }

    public void preOrder(TreeNode root){
        if(root==null)
            return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void levelOrder(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            for(int i=0;i<len;i++){
                TreeNode temp=queue.remove();
                System.out.print(temp.val+ " ");
                if(temp.left!=null)     queue.add(temp.left);
                if(temp.right!=null)   queue.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        int[] preorder={3,9,17,31,19,20,15,7};
        int[] inorder={31,17,9,19,3,15,20,7};
        Solution07 t=new Solution07();
        TreeNode root=t.buildTree(preorder,inorder);
        t.levelOrder(root);
    }
}
