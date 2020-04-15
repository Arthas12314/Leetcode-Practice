package codinginterviews;

/**
 * @author Arthas
 */
public class Solution65 {
    public int add(int a, int b) {
        /*^ 亦或 ----相当于 无进位的求和， 想象10进制下的模拟情况：
         （如:19+1=20；无进位求和就是10，而非20；因为它不管进位情况）

        & 与 ----相当于求每位的进位数， 先看定义：1&1=1；1&0=0；0&0=0;
         即都为1的时候才为1，正好可以模拟进位数的情况,还是想象10进制下模拟情况：（9+1=10，如果是用&的思路来处理，
         则9+1得到的进位数为1，而不是10，所以要用<<1向左再移动一位，这样就变为10了；

        这样公式就是：（a^b) ^ ((a&b)<<1)
        即：每次无进位求 + 每次得到的进位数--------我们需要不断重复这个过程，直到进位数为0为止；*/
        return b == 0 ? a : add(a ^ b, (a & b) << 1);
    }

    public static void main(String[] args) {
        Solution65 t=new Solution65();
        System.out.println(t.add(1,2));
    }
}
