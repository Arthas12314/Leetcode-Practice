package codinginterviews;

/**
 * @author Arthas
 */
public class Solution58_1 {
    public String reverseWords(String s) {
        String[] temp=s.trim().split(" ");
        StringBuilder res=new StringBuilder();
        for (int i = temp.length - 1; i >= 0; i--) {
            if ("".equals(temp[i])) {
                continue;
            }
            res.append(temp[i].trim()).append(" ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}
