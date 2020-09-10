/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/10
 * @time: 16:25
 */
public class Solution58 {
    public int lengthOfLastWord(String s) {
        String[] res = s.split(" ");
        return res[res.length - 1].length();
    }
}
