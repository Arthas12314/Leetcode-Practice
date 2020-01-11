import java.util.LinkedList;
import java.util.List;

public class BuildCompleteBinaryTree {
    private Integer[] sourceArray;
    private List<TreeNode> nodeList=new LinkedList<>();
    public BuildCompleteBinaryTree(Integer[] array){
        this.sourceArray=array;
    }
    TreeNode generate(){
        int len=sourceArray.length;
        //并把数组中的值都转化为树结点的值，存储到list中
        for(int i = 0; i < len; i++) {
            if(sourceArray[i]==null)
                nodeList.add(null);
            else
                nodeList.add(new TreeNode(sourceArray[i]));
        }
        for(int j = 0; j < len/2 - 1; j++) {
            //左孩子
            nodeList.get(j).left = nodeList.get(j*2 + 1);
            //右孩子
            nodeList.get(j).right = nodeList.get(j*2 + 2);
        }

        //最后一个父结点，可能没有右孩子
        int lastParent = len / 2 - 1;
        //所以，先处理左孩子
        nodeList.get(lastParent).left = nodeList.get(lastParent*2 + 1);
        //如果数组长度为奇数，那么就建立右孩子
        if(len % 2 == 1) {
            nodeList.get(lastParent).right = nodeList.get(lastParent*2 + 2);
        }
        return nodeList.get(0);
    }
}
