package coding.interviews;

import codinginterviews.ListNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Arthas
 */
public class Solution6 {
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> result = new LinkedList<>();
        while (head != null) {
            result.addFirst(head.val);
            head = head.next;
        }
        int[] res = new int[result.size()];
        Arrays.fill(res, result.get(0));
        return res;
    }
}
