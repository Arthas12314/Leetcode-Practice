package codinginterviews;

/**
 * @author Arthas
 */
public class Solution44 {
    public int findNthDigit(int n) {
        /*if (n < 10) {
            return n;
        }
        int num=0,i=0;
        while (n >= 0) {
            num=n;
            n-=Math.pow(10,i)*9*(i+1);
            i++;
        }

        int a = (num - 1) / i;
        int b = (num - 1) % i;
        a = (int)Math.pow(10,i-1) + a;
        String s = ""+a;
        return s.charAt(b)-'0';*/
        if (n <= 9) {
            return n;
        }
        n -= 9;
        long count = 90, dig = 2;
        //计算数位
        while (n > count * dig){
            n -= (count * dig);
            count *= 10;
            dig++;
        }
        //寻找对应的那个数字
        long num = (long)Math.pow(10, dig - 1) + n / dig;
        //如果刚好这个数字是在最后一位那就是上一个数字的最后一位 例如n 11 计算出来按道理是11，其实对应的是10的0
        if (n % dig == 0) {
            num--;
        } else { //如果是这个数的第二位例如 7888 那么应该78/100%10
            for (int i = 0; i < (dig - n % dig); i++) {
                num /= 10;
            }
        }
        return (int)num % 10;
    }

    public static void main(String[] args) {
        Solution44 t=new Solution44();
        System.out.println(t.findNthDigit(12));
    }
}
