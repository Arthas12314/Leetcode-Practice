import java.util.*;

// TODO
public class Solution829 {
    
    public int consecutiveNumbersSum(int n) {
        int res = 0;
        for (int i = 1; n > 0; n -= i++) {
            res += (n%i==0)?1:0;
        }
        return res;
    }
}
