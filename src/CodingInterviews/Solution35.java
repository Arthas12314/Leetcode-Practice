package CodingInterviews;

import java.util.HashMap;

public class Solution35 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node newHead = new Node(head.val);
        Node tmp = newHead;
        HashMap<Node, Node> map = new HashMap<>();
        map.put(head, tmp);
        while(head.next != null){
            head = head.next;
            tmp.next = new Node(head.val);
            tmp = tmp.next;
            map.put(head, tmp);
        }
        tmp.next = null;
        for (Node key : map.keySet()) {
            //新链表的每一个结点指向匹配的旧结点指向的旧结点的匹配新结点
            map.get(key).random = map.get(key.random);
        }
        return newHead;
    }
}
