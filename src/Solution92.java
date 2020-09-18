/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/18
 * @time: 19:18
 */
public class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }
        head = pre.next;
        ListNode after;
        while (n - m > 0) {
            after = head.next;
            head.next = after.next;
            after.next = pre.next;
            pre.next = after;
            n--;
        }
        return dummy.next;
    }
}
