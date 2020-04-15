package codinginterviews;

/**
 * @author Arthas
 */
public class Solution67 {
    public int strToInt(String str) {
        boolean isNegative= false;
        char[] strs=str.trim().toCharArray();
        if(strs.length<1){
            return 0;
        }
        int i=0;
        long res=0;
        if (strs[0]!='+' && strs[0]!='-' && !Character.isDigit(strs[0])) {
            return 0;
        }
        if (strs[0] == '-') {
            isNegative=true;
            i++;
        } else if (strs[0] == '+') {
            i++;
        }
        for (;i < strs.length && Character.isDigit(strs[i]); i++) {
            res=res*10+(strs[i]-'0');
            if (!isNegative && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (isNegative && -res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int)(isNegative?-res:res);
    }
}
