/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/5
 * @time: 22:12
 */
public class Solution38 {
    public String countAndSay(int n) {
        String num = "1";
        for (int i = 0; i < n - 1; i++) {
            num = helper(num);
        }
        return num;
    }

    private String helper(String num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int count = 1;
            while (i < num.length() - 1 && num.charAt(i + 1) == c) {
                count++;
                i++;
            }
            result.append(count).append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution38 t = new Solution38();
        System.out.println(t.countAndSay(30));
    }
}
