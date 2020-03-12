package CodingInterviews;

import java.util.List;

public class Solution18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        if (dummy.next.val == val) {
            return dummy.next;
        }
        while(dummy.next!=null && dummy.next.val!=val){
            dummy=dummy.next;
        }
        if (dummy.next != null) {
            dummy.next = dummy.next.next;
        }
        return head;
    }
}
