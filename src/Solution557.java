
/**
 * @author Arthas
 */
public class Solution557 {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            char[] str = strs[i].toCharArray();
            for (int j = str.length - 1; j >= 0; j--) {
                result.append(str[j]);
            }
            result.append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
