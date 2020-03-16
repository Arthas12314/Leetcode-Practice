package CodingInterviews;


import utils.BuildBST;
import utils.BuildBST.*;
import java.util.LinkedList;
import java.util.List;

public class Solution36 {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };

    Node head=null;
    Node pre=null;
    public Node treeToDoublyList(Node root) {
        if(root==null){
            return null;
        }
        inorder(root);
        pre.right=head;
        head.left=pre;
        return head;
    }

    private void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        node.left=pre;
        if(pre!=null){
            pre.right=node;
        } else{
            head=node;
        }
        pre=node;
        inorder(node.right);
    }

    public static void main(String[] args) {
        int[] a={4,2,5,1,3};
        BuildBST buildBST=new BuildBST();
        Node root=null;
        for (int i = 0; i < a.length; i++) {
            root=buildBST.buildTree(root,a[i]);
        }
        Solution36 t=new Solution36();
        t.treeToDoublyList(root);
    }
}
