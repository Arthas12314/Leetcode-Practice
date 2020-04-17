/**
 * @author Arthas
 */
public class Solution198 {
    public int rob(int[] nums) {
        int pre = 0, cur = 0, tmp;
        for(int num : nums) {
            tmp = cur;
            cur = Math.max(pre + num, cur);
            pre = tmp;
        }
        return cur;
    }

    public static void main(String[] args) {
        Solution198 t=new Solution198();
        int[] nums={2,1,3,4};
        System.out.println(t.rob(nums));
        nums= new int[]{2, 23, 9, 3, 20};
        System.out.println(t.rob(nums));
    }
}
