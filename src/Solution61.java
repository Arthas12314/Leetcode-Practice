

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/11
 * @time: 16:35
 */
public class Solution61 {
    public static void main(String[] args) {
        Solution61 t = new Solution61();
        ListNode head = new ListNode(1, new ListNode(2)); //new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(t.rotateRight(head, 1));
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode rotateNode = head;
        int len = 1;
        while (rotateNode.next != null) {
            rotateNode = rotateNode.next;
            len++;
        }
        k = len - k % len;
        rotateNode.next = head;
        for (int i = 0; i < k; i++) {
            head = head.next;
        }
        rotateNode = head;
        for (int i = 0; i < len - 1; i++) {
            rotateNode = rotateNode.next;
        }
        rotateNode.next = null;
        return head;
    }
}
