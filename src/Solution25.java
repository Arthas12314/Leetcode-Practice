/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/3
 * @time: 15:28
 */
public class Solution25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        for (int i = 0; i < length / k; i++) {
            for (int j = 0; j < k - 1; j++) {
                temp = cur.next;
                cur.next = temp.next;
                temp.next = pre.next;
                pre.next = temp;
            }
            pre = cur;
            cur = pre.next;
        }

        return dummy.next;
    }
}
