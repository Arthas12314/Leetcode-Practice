/**
 * @author Arthas
 */
public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int value=x,temp=0;
        long res=0;
        while (value != 0) {
            temp=value%10;
            value/=10;
            res=10*res+temp;
        }
        return res==x;
    }
}
