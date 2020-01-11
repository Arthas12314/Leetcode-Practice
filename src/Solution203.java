import java.util.Random;

public class Solution203 {
    public ListNode removeElements(ListNode head,int val,int depth){
        /*while(head!=null && head.val==val){
            ListNode delNode=head;
            head=head.next;
            delNode.next=null;
        }
        ListNode pre=head;
        while(pre.next!=null){
            if(pre.next.val==val){
                ListNode delNode=pre.next;
                pre.next=delNode.next;
                delNode.next=null;
            }
            else {
                pre=pre.next;
            }
        }
        return head;*/
        /*while(head!=null && head.val==val){
            head=head.next;
        }
        if(head==null)  return null;
        ListNode pre=head;
        while(pre.next!=null){
            if(pre.next.val==val){
                pre.next=pre.next.next;
            }
            else {
                pre=pre.next;
            }
        }
        return head;*/
        /*ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode pre=dummy;
        while(pre.next!=null){
            if(pre.next.val==val){
                pre.next=pre.next.next;
            }
            else {
                pre=pre.next;
            }
        }
        return dummy.next;*/
        /*if(head==null)
            return null;
        head.next=removeElements(head.next,val,depth+1);
        return head.val==val?head.next:head;*/
        String depthString = generateDepthString(depth);
        System.out.print(depthString);
        System.out.println("Call:remove "+val + " in "+head);

        if(head==null){
            System.out.print(depthString);
            System.out.println("Return " + head);
            return null;
        }
        ListNode res=removeElements(head.next,val,depth+1);
        System.out.print(depthString);
        System.out.println("After remove " + val +": " +res);
        ListNode ret;
        if(head.val==val)
            ret=res;
        else {
            head.next=res;
            ret=head;
        }
        System.out.print(depthString);
        System.out.println("Return: "+ ret+ " ");
        return ret;
    }

    private String generateDepthString(int depth){
        StringBuilder res=new StringBuilder();
        for(int i=0;i<depth;i++)
            res.append("--");
        return res.toString();
    }

    public static void main(String[] args) {
        Solution203 t=new Solution203();
        int[] arr=new int[6];
        Random random=new Random();
        for(int i=0;i<6;i++){
            arr[i]=i;//random.nextInt(10);
        }
        ListNode head=new ListNode(arr);
        double startTime =System.nanoTime();
        head=t.removeElements(head,2,0);
        double endTime =System.nanoTime();
        System.out.println(head);
        System.out.println();
        System.out.println(endTime-startTime);
    }
}
