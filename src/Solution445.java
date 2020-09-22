import java.util.Deque;
import java.util.LinkedList;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/20
 * @time: 21:01
 */
public class Solution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> deque1 = new LinkedList<>();
        Deque<Integer> deque2 = new LinkedList<>();
        while (l1 != null) {
            deque1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            deque2.push(l2.val);
            l2 = l2.next;
        }
        ListNode pre = new ListNode(-1);
        ListNode tmpNode;
        int carry = 0;
        int temp;
        while (!deque1.isEmpty() || !deque2.isEmpty() || carry > 0) {
            temp = (!deque1.isEmpty() ? deque1.pop() : 0) + (!deque2.isEmpty() ? deque2.pop() : 0) + carry;
            carry = temp / 10;
            temp %= 10;
            ListNode cur = new ListNode(temp);
            tmpNode = pre.next;
            pre.next = cur;
            cur.next = tmpNode;
        }
        return pre.next;
    }
}
