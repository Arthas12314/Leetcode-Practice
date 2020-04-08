package codinginterviews;

import java.util.*;

/**
 * @author Arthas
 */
public class Solution59_2 {
    Queue<Integer> queue;
    Deque<Integer> maxQueue;
    public Solution59_2() {
        queue=new ArrayDeque<>();
        maxQueue=new ArrayDeque<>();
    }
    public int max_value() {
        if (maxQueue.isEmpty()) {
            return -1;
        }
        return maxQueue.peek();
    }
    public void push_back(int value) {
        queue.add(value);
        while (!maxQueue.isEmpty() && value > maxQueue.getLast()) {
            maxQueue.pollLast();
        }
        maxQueue.add(value);
    }
    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        int ans=queue.poll();
        if (ans == maxQueue.peek()) {
            maxQueue.poll();
        }
        return ans;
    }
}
