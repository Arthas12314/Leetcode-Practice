/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/3
 * @time: 13:59
 */
public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur;
        while (pre.next != null && pre.next.next != null) {
            cur = pre.next.next;
            pre.next.next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            pre = pre.next.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        Solution24 t = new Solution24();
        System.out.println(t.swapPairs(head));
    }
}
