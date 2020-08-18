package coding.interviews;

/**
 * @author Arthas
 */
public class Solution5 {
    public String replaceSpace(String s) {
        char[] str = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            result.append(str[i] == ' ' ? "%20" : str[i]);
        }
        return result.toString();
    }
}
