import utils.StringToIntArrayUtil;

import java.util.Arrays;
import java.util.List;

public class Solution473 {
    private int len;
    
    public boolean makesquare(int[] matchsticks) {
        if (matchsticks.length < 4) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < matchsticks.length; i++) {
            sum += i;
        }

        if (sum % 4 != 0) {
            return false;
        }
        len = sum >> 2;

        if (matchsticks[matchsticks.length - 1] > len) {
            return false;
        }
        Arrays.sort(matchsticks);
        boolean[] recordStep = new boolean[matchsticks.length];
        return dfs(matchsticks, recordStep, 0, 0, 4);
    }
    
    private boolean dfs(int[] matchsticks, boolean[] recordStep, int index, int sum, int count) {
        if (count == 1) {
            return true;
        }
        if (sum == len) {
            return dfs(matchsticks, recordStep, 0, 0, count - 1);
        }
        for (int i = index; i < matchsticks.length; i++) {
            if (recordStep[i]) {
                continue;
            }
            if (len < sum) {
                return false;
            }
            recordStep[i] = true;
            if (dfs(matchsticks, recordStep, index + 1, sum + matchsticks[i], count)) {
                return true;
            }
            recordStep[i] = false;
            while (i < matchsticks.length - 1 && matchsticks[i + 1] == matchsticks[i]) {
                i++;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        List<List<Integer>> matrixList =
            StringToIntArrayUtil.convert("[1,1,2,2,2]\n" + "[1,5,2,4,3,3,5,1]\n" + "[5,5,5,5,4,4,4,4,3,3,3,3]");
        Solution473 solution473 = new Solution473();
        for (List<Integer> list : matrixList) {
            System.out.println(solution473.makesquare(StringToIntArrayUtil.collection2Array(list)));
        }
    }
}
