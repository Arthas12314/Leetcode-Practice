import java.util.HashMap;
import java.util.HashSet;

public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        /*HashSet<ListNode> set=new HashSet<>();
        while(head!=null){
            if(!set.contains(head)){
                set.add(head);
                head=head.next;
            }
            else
                return head;
        }
        return null;*/
        //优秀题解
        ListNode fast = head, slow = head;
        //第一次重合
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        /**
         *  所有走到入环点的步数都是入环前长度a加n*环长度b
         *  重合时快慢节点分别走了2nb和nb步
         *  因此快回到头节点走a步即可重合
         */
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
