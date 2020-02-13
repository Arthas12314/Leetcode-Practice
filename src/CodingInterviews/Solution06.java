package CodingInterviews;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

class ListNode {
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
            res.append(cur.val).append("->");
            cur=cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}

public class Solution06 {

    public int[] reversePrint(ListNode head) {
        //使用链表储存->差
        /*LinkedList<Integer> list=new LinkedList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;*/
        int len=0;
        ListNode temp=head;
        while(head!=null){
            len++;
            head=head.next;
        }
        int[] res=new int[len];
        for(int i=0;i<len;i++){
            res[len-i-1]=temp.val;
            temp=temp.next;
        }
        return res;
    }
}
