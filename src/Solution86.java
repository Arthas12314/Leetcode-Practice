/**
 * @author Arthas
 */
public class Solution86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return head;
        }

        ListNode smallerList = new ListNode(-1);
        ListNode largerList = new ListNode(-1);
        ListNode dummy1 = smallerList;
        ListNode dummy2 = largerList;
        while (head != null) {
            if (head.val < x) {
                smallerList.next = head;
                smallerList = smallerList.next;
            } else {
                largerList.next = head;
                largerList = largerList.next;
            }
            head = head.next;
        }
        largerList.next = null;
        smallerList.next = dummy2.next;
        return dummy1.next;
    }
}
