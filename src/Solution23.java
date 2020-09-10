import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/10
 * @time: 13:39
 */
public class Solution23 {
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        lists[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
        lists[2] = new ListNode(2, new ListNode(6));
        ListNode res = new Solution23().mergeKLists(lists);
        System.out.println(res);
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while (isNotAllNull(lists)) {
            int index = selectMax(lists);
            cur.next = new ListNode(lists[index].val);
            lists[index] = lists[index].next;
            cur = cur.next;
        }
        return dummy.next;
    }

    private int selectMax(ListNode[] lists) {
        int maxIndex = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null && lists[i].val <= min) {
                min = lists[i].val;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private boolean isNotAllNull(ListNode[] lists) {
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                return true;
            }
        }
        return false;
    }

    public ListNode mergeKLists2(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode node1, ListNode node2) {
                return Integer.compare(node1.val, node2.val);
            }
        });
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == null) {
                continue;
            }
            queue.add(lists[i]);
        }
        while (!queue.isEmpty()) {
            ListNode tmp = queue.poll();
            cur.next = tmp;
            cur = cur.next;
            if (tmp.next != null) {
                queue.add(tmp.next);
            }
        }
        return dummy.next;
    }
}
