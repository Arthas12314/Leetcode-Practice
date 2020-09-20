/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/20
 * @time: 16:53
 */
public class Solution328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode oddNode = head;
        ListNode evenNode = head.next;
        ListNode firstEvenNode = evenNode;
        while (oddNode.next != null && evenNode.next != null) {
            oddNode.next = evenNode.next;
            oddNode = oddNode.next;
            evenNode.next = oddNode.next;
            evenNode = evenNode.next;
        }
        oddNode.next = firstEvenNode;
        return head;
    }
}
