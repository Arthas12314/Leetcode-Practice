package codinginterviews;

/**
 * @author Arthas
 */
public class Solution63 {
    public int maxProfit(int[] prices) {
        int res=0,min=Integer.MAX_VALUE;
        for (int price : prices) {
            if (min > price) {
                min = price;
            }
            res = Math.max(price - min, res);
        }
        return res;
    }
}
