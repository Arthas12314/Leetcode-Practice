import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// sb
public class Solution497 {
    private Random r = new Random();

    int n;
    long[] sum;
    long total;
    int[][] rects;

    public Solution497(int[][] _rects) {
        this.rects = _rects;
        n = rects.length;
        sum = new long[n + 1];
        for(int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + (rects[i][2] - rects[i][0] + 1) * (rects[i][3] - rects[i][1] + 1);
        }
        total = sum[n];
    }

    public int[] pick() {
        long v = r.nextLong()%(total + 1);
        int idx = index(v);
        int[] arr = rects[idx];
        return new int[]{arr[0] + r.nextInt(arr[2] - arr[0] + 1), arr[1] + r.nextInt(arr[3] - arr[1] + 1)};
    }

    private int index(long v) {
        int start = 1;
        int end = sum.length - 1;
        int mid;
        while(start < end) {
            mid = (start + end) >> 1;
            if(sum[mid] < v + 1) start = mid + 1;
            else end = mid;
        }
        return start - 1;
    }
}
