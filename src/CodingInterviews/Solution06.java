package CodingInterviews;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

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
