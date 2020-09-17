/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/17
 * @time: 22:19
 */
public class Solution87 {
    public boolean isScramble(String s1, String s2) {
        if (s1.length() == 0 && s2.length() == 0) {
            return true;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        return dfs(s1.toCharArray(), s2.toCharArray(), 0, 0, s1.length());
    }

    private boolean dfs(char[] s1, char[] s2, int start1, int start2, int len) {
        if (len == 1) {
            return s1[start1] == s2[start2];
        }
        if (!equals(s1, s2, start1, start2, len)) {
            return false;
        }

        for (int i = 1; i < len; i++) {
            if (dfs(s1, s2, start1, start2, i) && dfs(s1, s2, start1 + i, start2 + i, len - i)) {
                return true;
            }

            if (dfs(s1, s2, start1, start2 + len - i, i) && dfs(s1, s2, start1 + i, start2, len - i)) {
                return true;
            }
        }
        return false;
    }

    private boolean equals(char[] s1, char[] s2, int start1, int start2, int len) {
        int[] map = new int[26];
        for (int i = 0; i < len; i++) {
            map[s1[start1 + i] - 'a']++;
            map[s2[start2 + i] - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (map[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
