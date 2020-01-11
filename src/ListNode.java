public class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }
    public ListNode(int[] arr){
        if(arr==null || arr.length==0)
            throw new IllegalArgumentException("arr cannot be empty.");
        this.val=arr[0];
        ListNode temp=this;
        for(int i=1;i<arr.length;i++){
            temp.next=new ListNode(arr[i]);
            temp=temp.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder res=new StringBuilder();
        ListNode cur=this;
        while(cur!=null){
            res.append(cur.val+"->");
            cur=cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
