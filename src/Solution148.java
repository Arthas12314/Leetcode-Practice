import java.util.Random;

/**
 * @author Arthas
 */
public class Solution148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow.next;
        slow.next = null;
        head = sortList(head);
        fast = sortList(fast);
        return mergeList(head, fast);
    }

    private ListNode mergeList(ListNode node1, ListNode node2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                cur.next = node1;
                node1 = node1.next;
            } else {
                cur.next = node2;
                node2 = node2.next;
            }
            cur = cur.next;
        }
        cur.next = node1 == null ? node2 : node1;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(-1);
        ListNode cur = listNode;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            cur.next = new ListNode(random.nextInt() % 10);
            cur = cur.next;
        }
        Solution148 t = new Solution148();
        System.out.println(t.sortList(listNode));
    }
}
