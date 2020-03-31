package codinginterviews;

/**
 * @author Arthas
 */
public class Solution58_2 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder res=new StringBuilder();
        res.append(s.substring(n,s.length())).append(s.substring(0,n));
        return res.toString();
    }
}
