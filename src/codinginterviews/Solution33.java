package codinginterviews;

public class Solution33 {
    /*public boolean verifyPostorder(int[] postorder) {
        //暴力方法
        *//*if (postorder.length < 1) {
            return true;
        }
        int[] inorder=Arrays.copyOf(postorder,postorder.length);
        Arrays.sort(inorder);
        Stack<Integer> stack=new Stack<>();
        int j=0;
        for (int value : inorder) {
            stack.push(value);
            while (j < inorder.length && !stack.isEmpty() && stack.peek() == postorder[j]) {
                stack.pop();
                j++;
            }
        }
        return j==inorder.length;*//*
        // 单调栈使用，单调递增的单调栈
        Stack<Integer> stack=new Stack<>();
        int pre = Integer.MAX_VALUE;
        // 逆向遍历，就是翻转的先序遍历
        for(int i=postorder.length-1;i>=0;i--){
            // 左子树元素必须要小于递增栈被peek访问的元素，否则就不是二叉搜索树
            if(postorder[i]>pre){
                return false;
            }
            while(!stack.isEmpty() && postorder[i]<stack.peek()){
                // 数组元素小于单调栈的元素了，表示往左子树走了，记录下上个根节点
                // 找到这个左子树对应的根节点，之前右子树全部弹出，不再记录，因为不可能在往根节点的右子树走了
                pre = stack.peek();
                stack.pop();
            }
            // 新元素入栈
            stack.push(postorder[i]);
        }
        return true;
    }*/
    public boolean verifyPostorder(int[] postorder) {
        if (postorder.length < 2) {
            return true;
        }
        return verify(postorder, 0, postorder.length - 1);
    }

    // 递归实现
    private boolean verify(int[] postorder, int left, int right){
        // 当前区域不合法的时候直接返回true就好
        if (left >= right) {
            return true;
        }
        // 当前树的根节点的值
        int rootValue = postorder[right];
        int k = left;
        // 从当前区域找到第一个大于根节点的，说明后续区域数值都在右子树中
        while (k < right && postorder[k] < rootValue) {
            k++;
        }
        // 进行判断后续的区域是否所有的值都是大于当前的根节点，如果出现小于的值就直接返回false
        for (int i = k; i < right; i++) {
            if (postorder[i] < rootValue) {
                return false;
            }
        }

        // 当前树没问题就检查左右子树
        // 检查左子树
        if (!verify(postorder, left, k - 1)) {
            return false;
        }
        // 检查右子树
        if (!verify(postorder, k, right - 1)) {
            return false;
        }
        return true;
    }
}
