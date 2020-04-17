/**
 * @author Arthas
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*int sum=0,count=0;
        ListNode dummy=new ListNode(-1);
        ListNode res=dummy;
        while (l1 != null && l2 != null) {
            sum=l1.val+l2.val+count;
            if (sum > 9) {
                count=1;
                sum-=10;
            }else {
                count=0;
            }
            dummy.next=new ListNode(sum);
            l1=l1.next;
            l2=l2.next;
            dummy=dummy.next;
        }
        while (l1 != null) {
            sum=l1.val+count;
            if (sum > 9) {
                count=1;
                sum-=10;
            }else {
                count=0;
            }
            dummy.next=new ListNode(sum);
            dummy=dummy.next;
            l1=l1.next;
        }
        while (l2 != null) {
            sum=l2.val+count;
            if (sum > 9) {
                count=1;
                sum-=10;
            }else {
                count=0;
            }
            dummy.next=new ListNode(sum);
            dummy=dummy.next;
            l2=l2.next;
        }
        if (count == 1) {
            dummy.next=new ListNode(1);
        }
        return res.next;*/
        int sum=0,count=0;
        ListNode dummy=new ListNode(-1);
        ListNode res=dummy;
        while (l1 != null || l2 != null || count!=0) {
            sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + count;
            if (sum > 9) {
                count=1;
                sum-=10;
            }else {
                count=0;
            }
            dummy.next=new ListNode(sum);
            dummy=dummy.next;
            if (l1 != null) {
                l1=l1.next;
            }
            if (l2 != null) {
                l2=l2.next;
            }
        }
        return res.next;
    }
}
