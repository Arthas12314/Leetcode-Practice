/**
 * @author Arthas
 */
public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast=head,slow=head,prev=null;
        while (fast != null && fast.next != null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        while (slow != null) {
            ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        while (head != null && prev != null) {
            if (head.val != prev.val) {
                return false;
            }
            head=head.next;
            prev=prev.next;
        }
        return true;
    }
}
