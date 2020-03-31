package codinginterviews;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Arthas
 */
public class Solution59_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length < 1) {
            return nums;
        }
        Deque<Integer> deque=new LinkedList<>();
        List<Integer> res=new ArrayList<>();
        for (int i = 0; i < k; i++) {
            while (deque.size() != 0 && nums[deque.getLast()] < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

        for (int i = k; i < nums.length; i++) {
            res.add(nums[deque.peek()]);
            // 把所有比nums[i]小的从右边弹出。
            while(deque.peek()!=null && nums[deque.getLast()]<nums[i]){
                deque.removeLast();
            }
            deque.addLast(i);
            // 如果peek的索引被滑动窗口移出，则deque也要移出
            if(i-k==deque.peek()){
                deque.removeFirst();
            }
        }
        res.add(nums[deque.peek()]);
        int[] a = new int[res.size()];
        for(int i=0;i<a.length;i++){
            a[i] = res.get(i);
        }
        return a;
    }
}
