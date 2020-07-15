/**
 * @author Arthas
 */
public class Solution1011 {
    public int shipWithinDays(int[] weights, int D) {
        int l = 0;
        int r = Integer.MAX_VALUE;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (canShip(weights, D, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean canShip(int[] weights, int D, int K) {
        int shipCapacity = K;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > K) {
                return false;
            }
            if (weights[i] < shipCapacity) {
                shipCapacity = K;
                D--;
            }
            shipCapacity -= weights[i];
        }
        return D > 0;
    }
}
