package CodingInterviews;

public class Solution24 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev=null;
        ListNode next=head.next;
        while(next!=null){
            head.next=prev;
            prev=head;
            head=next;
            next=next.next;
        }
        head.next=prev;
        return head;
    }
}
