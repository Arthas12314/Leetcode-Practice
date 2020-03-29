package CodingInterviews;

import java.util.HashSet;

/**
 * @author Arthas
 */
public class Solution52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode i=headA,j=headB;
        while(i!=j){
            i=i==null?headB:i.next;
            j=j==null?headA:j.next;
        }
        return i;
    }
}
