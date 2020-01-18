public class Solution86 {
    public ListNode partition(ListNode head, int x) {
        if(head==null)
            return head;
        //大于等于x值的储存链表
        ListNode dummy=new ListNode(-1);
        //小于x值得储存链表
        ListNode cur=new ListNode(-1);
        //头节点标志储存
        ListNode temp1=cur,temp2=dummy;
        while(head!=null){
            if(head.val>=x){
                dummy.next=head;
                dummy=dummy.next;
            }
            else {
                cur.next=head;
                cur=cur.next;
            }
            head=head.next;
        }
        dummy.next=null;
        cur.next=temp2.next;
        return temp1.next;
    }
}
