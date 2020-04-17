/**
 * @author Arthas
 */
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode fast=headA;
        ListNode slow=headB;
        while (fast != slow) {
            fast=fast!=null?fast.next:headB;
            slow=slow!=null?slow.next:headA;
        }
        return fast;
    }
}
