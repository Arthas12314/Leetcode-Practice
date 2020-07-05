import java.util.HashSet;
import java.util.Set;

public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution217 t =new Solution217();
        System.out.println(t.containsDuplicate(new int[]{1,2,3}));
    }
}
