package CodingInterviews;

import java.util.PriorityQueue;

/**
 * @author Arthas
 */
public class Solution41 {
    //大顶
    PriorityQueue<Integer> left;
    //小顶
    PriorityQueue<Integer> right;
    public Solution41() {
        left=new PriorityQueue<>((n1,n2)->n2-n1);
        right=new PriorityQueue<>();
    }
    public void addNum(int num) {
        left.add(num);
        right.add(left.poll());
        if (left.size() + 1 < right.size()) {
            left.add(right.poll());
        }
    }
    public double findMedian() {
        if (right.size() > left.size()) {
            return right.peek();
        }
        return (left.peek()+right.peek())/2.0;
    }

    public static void main(String[] args) {
        Solution41 t=new Solution41();
        for (int i = 0; i < 10; i++) {
            t.addNum(i+1);
            System.out.println(t.findMedian());
        }
    }
}
