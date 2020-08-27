
/**
 * @author Arthas
 */
public class Solution459 {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1, s.length() * 2 - 1).contains(s);
    }

    public static void main(String[] args) {
        Solution459 t = new Solution459();
        System.out.println(t.repeatedSubstringPattern("abab"));
    }
}
