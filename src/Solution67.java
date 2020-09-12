/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/12
 * @time: 0:19
 */
public class Solution67 {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        StringBuilder res = new StringBuilder();
        if (i < 0 && j < 0) {
            return "0";
        }
        int temp = 0;
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                temp += a.charAt(i) - '0';
            }
            if (j >= 0) {
                temp += b.charAt(j) - '0';
            }
            res.append(temp % 2);
            temp >>= 1;
            i--;
            j--;
        }
        if (temp != 0) {
            res.append(temp);
        }
        return res.reverse().toString();
    }
}
