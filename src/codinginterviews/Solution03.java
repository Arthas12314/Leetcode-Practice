package codinginterviews;

import java.util.HashSet;

public class Solution03 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={2, 3, 1, 0, 5, 3};
        Solution03 t=new Solution03();
        System.out.println(t.findRepeatNumber(nums));
    }
}
