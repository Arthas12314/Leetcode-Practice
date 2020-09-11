import java.util.Arrays;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/11
 * @time: 23:35
 */
public class Solution66 {
    public static void main(String[] args) {
        Solution66 t = new Solution66();
        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(t.plusOne(digits)));
    }

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[len + 1];
        result[0] = 1;
        return result;
    }
}
