package codinginterviews;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> helper;
    public MinStack() {
        stack=new Stack<>();
        helper=new Stack<>();
    }

    public void push(int x) {
        helper.push(x);
        if (stack.isEmpty() || stack.peek() > x) {
            stack.push(x);
        }
    }

    public void pop() {
        int temp=helper.pop();
        if (temp == stack.peek()) {
            stack.pop();
        }
    }

    public int top() {
        return helper.peek();
    }

    public int min() {
        return stack.peek();
    }
}
