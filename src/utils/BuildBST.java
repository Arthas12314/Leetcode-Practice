package utils;

import CodingInterviews.Solution36.Node;

public class BuildBST {
    public Node buildTree(Node node,int value){
        if (node == null) {
            node=new Node(value);
            return node;
        }
        if(node.val>value){
            node.left=buildTree(node.left,value);
        }
        if (node.val < value) {
            node.right=buildTree(node.right,value);
        }
        return node;
    }
}
