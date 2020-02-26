public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)   return false;
        ListNode i=head,j=head.next;
        while(i!=j){
            if(j.next==null || j.next.next==null)
                return false;
            j=j.next.next;
            i=i.next;
        }
        return true;
    }
}
