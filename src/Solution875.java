public class Solution875 {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        if (piles.length == h) {
            return max;
        }
        int min = 1;
        while (min < max) {
            int cur = (max+min)>>1;
            long usedTime = 0;
            for (int i = 0; i < piles.length; i++) {
                // usedTime += (piles[i] % cur == 0 ? piles[i] / cur : piles[i] / cur + 1);
                // 比上述方式性能高一倍
                usedTime += (piles[i] - 1) / cur + 1;
            }
            if (usedTime > h) {
                min = cur + 1;
            } else {
                max = cur;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Solution875 solution875 = new Solution875();
        System.out.println(solution875.minEatingSpeed(new int[] {312884470}, 312884469));
    }
}
