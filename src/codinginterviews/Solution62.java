package codinginterviews;

import java.util.LinkedList;
import java.util.List;

public class Solution62 {
    public int lastRemaining(int n, int m) {
        /*List<Integer> list=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int i=0;
        while (n > 1) {
            i=(i+m-1)%n;
            list.remove(i);
            n--;
        }
        return list.get(0);*/

        int ans = 0;
        // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution62 t=new Solution62();
        System.out.println(t.lastRemaining(10,17));
    }
}
