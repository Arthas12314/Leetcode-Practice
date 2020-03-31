package codinginterviews;

/**
 * @author Arthas
 */
public class Solution50 {
    public char firstUniqChar(String s) {
        char[] str=s.toCharArray();
        int[] map=new int[26];
        for (char  c: str) {
            map[c - 'a']++;
        }

        for (char c : str) {
            if (map[c - 'a'] == 1) {
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        Solution50 t=new Solution50();
        System.out.println(t.firstUniqChar("abaccdeff"));
    }
}
