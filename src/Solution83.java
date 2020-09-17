/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/17
 * @time: 17:17
 */
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur;
        while (head != null) {
            cur = head.next;
            while (cur != null && cur.val == head.val) {
                cur = cur.next;
            }
            head.next = cur;
            head = head.next;
        }
        return dummy.next;
    }
}
