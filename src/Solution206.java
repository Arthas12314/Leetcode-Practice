/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/20
 * @time: 16:22
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode after;
        while (cur != null) {
            after = cur.next;
            cur.next = pre;
            pre = cur;
            cur = after;
        }
        return pre;
    }
}
