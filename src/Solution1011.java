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

    private boolean canShip(int[] weights, int date, int capacity) {
        int currentCapacity = capacity;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > capacity) {
                return false;
            }
            if (weights[i] > currentCapacity) {
                currentCapacity = capacity;
                date--;
            }
            currentCapacity -= weights[i];
        }
        return date > 0;
    }
}
