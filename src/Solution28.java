/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/4
 * @time: 22:20
 */
public class Solution28 {
    private int[] nextMap(String needle) {
        int len = needle.length();
        int j = -1;
        int[] next = new int[len];
        for (int i = 0; i < len - 1; ) {
            if (j < 0 || needle.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
        return next;
    }

    public int strStr(String haystack, String needle) {
        int sourceLen = haystack.length();
        int targetLen = needle.length();
        if (targetLen < 1) {
            return 0;
        }
        if (sourceLen < targetLen) {
            return -1;
        }
        int[] next = nextMap(needle);
        int i = 0;
        int j = 0;
        for (; i < sourceLen && j < targetLen; ) {
            if (j < 0 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        return i - j;
    }
}
