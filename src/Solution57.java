import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/10
 * @time: 15:56
 */
public class Solution57 {
    public static void main(String[] args) {
        Solution57 t = new Solution57();
        int[][] a = {{1, 5}};//{{1, 2}, {3,5}, {6, 7}, {8, 10},{12,16}};//{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[] b = {2, 8};
        int[][] res = t.insert(a, b);
        for (int[] i : res) {
            System.out.println("[" + i[0] + "," + i[1] + "]");
        }
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> intervalList = new ArrayList<>();
        List<int[]> res = new ArrayList<>();
        if (intervals.length < 1 || intervals[0].length < 1) {
            res.add(newInterval);
            return res.toArray(new int[res.size()][2]);
        }
        boolean mark = true;
        for (int i = 0; i < intervals.length; i++) {
            if (mark && newInterval[0] <= intervals[i][0]) {
                intervalList.add(newInterval);
                i--;
                mark = false;
                continue;
            }
            intervalList.add(intervals[i]);
        }
        if (mark) {
            intervalList.add(newInterval);
        }

        int left = 0, right = 0, len = intervalList.size();
        for (int i = 0; i < intervalList.size(); i++) {
            left = intervalList.get(i)[0];
            right = intervalList.get(i)[1];
            while (i < len - 1 && intervalList.get(i + 1)[0] <= right) {
                right = Math.max(right, intervalList.get(i + 1)[1]);
                i++;
            }
            res.add(new int[]{left, right});
        }
        return res.toArray(new int[res.size()][2]);
    }
}
