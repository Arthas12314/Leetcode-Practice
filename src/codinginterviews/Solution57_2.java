package codinginterviews;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arthas
 */
public class Solution57_2 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res=new ArrayList<>();
        for (int i = 0; i <= target / 2; i++) {
            int sum=0,j=i;
            while (sum < target) {
                sum+=j;
                j++;
            }
            if (sum == target) {
                int[] temp=new int[j];
                for (int k = 0; k < j-i; k++) {
                    temp[k]=k+i;
                }
                res.add(temp);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
