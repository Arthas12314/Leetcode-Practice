import java.util.*;

public class Solution260 {
    public static int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            res[0] ^= nums[i];
        }
        //a & (-a)能够求出该数二进制形式最右侧1的位置，异或运算保证结果两束该位数字不同
        int diffMark = res[0] & (-res[0]);
        for (int i = 0; i < nums.length; i++) {
            //按区分标识位&条件，将两个结果数拆分到两组
            if ((nums[i] & diffMark) == 0) {
                res[1] ^= nums[i];
            }
        }
        res[0] ^= res[1];
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 3, 2, 5};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
}
