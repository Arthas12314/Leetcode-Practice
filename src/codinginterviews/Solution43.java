package codinginterviews;

/**
 * @author Arthas
 */
public class Solution43 {
    public int countDigitOne(int n) {
        int count = 0;
        // 从个位开始遍历到最高位
        long i = 1;
        while(n / i != 0) {
            // 高位
            long high = n / (10 * i);
            // 当前位
            long cur = (n / i) % 10;
            long low = n - (n / i) * i;
            if(cur == 0) {
                count += high * i;
            }else if(cur == 1) {
                count += high * i + (low + 1);
            }else {
                count += (high + 1) * i;
            }
            i = i * 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution43 t=new Solution43();
        System.out.println(t.countDigitOne(1000));
    }
}
