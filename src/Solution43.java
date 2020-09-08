/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/6
 * @time: 16:07
 */
public class Solution43 {
    public String multiply(String num1, String num2) {
        int cur = 0;
        StringBuilder res = new StringBuilder();
        int[] temp = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            int first = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                int second = num2.charAt(j) - '0';
                cur = temp[i + j + 1] + first * second;
                temp[i + j + 1] = cur % 10;
                temp[i + j] += cur / 10;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if (i == 0 && temp[i] == 0) {
                continue;
            }
            res.append(temp[i]);
        }
        return res.toString();
    }
}
