import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution56 {
    public static void main(String[] args) {
        Solution56 t = new Solution56();
        int[][] a = {{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}};//{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] res = t.merge2(a);
        for (int[] i : res) {
            System.out.println("[" + i[0] + "," + i[1] + "]");
        }
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length < 1 || intervals[0].length < 1) {
            return intervals;
        }
        ArrayList<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (res.get(res.size() - 1)[1] < intervals[i][0]) {
                res.add(intervals[i]);
            } else if (res.get(res.size() - 1)[1] >= intervals[i][0]) {
                int[] temp = res.remove(res.size() - 1);
                if (temp[1] < intervals[i][1]) {
                    res.add(new int[]{temp[0], intervals[i][1]});
                } else {
                    res.add(new int[]{temp[0], temp[1]});
                }
            }
        }
        int[][] result = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            result[i][0] = res.get(i)[0];
            result[i][1] = res.get(i)[1];
        }
        return result;
    }

    public int[][] merge2(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        int len = intervals.length;
        if (len < 1 || intervals[0].length < 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(nums -> nums[0]));
        int left = 0, right = 0;
        for (int i = 0; i < len; i++) {
            left = intervals[i][0];
            right = intervals[i][1];
            while (i < len - 1 && intervals[i + 1][0] <= right) {
                right = Math.max(right, intervals[i + 1][1]);
                i++;
            }
            res.add(new int[]{left, right});
        }
        return res.toArray(new int[res.size()][2]);
    }
}
