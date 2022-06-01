import java.util.HashSet;
import java.util.Set;

public class Solution128 {
    //TODO
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int cur,curCount;
        int resCount = 0;
        for (Integer num : nums) {
            if (set.remove(num)) {
                // 向当前元素的左边搜索,eg: 当前为100, 搜索：99，98，97,...
                curCount = 1;
                cur = num;
                while (set.remove(cur - 1)) {
                    cur--;
                }
                curCount += (num - cur);
                // 向当前元素的右边搜索,eg: 当前为100, 搜索：101，102，103,...
                cur = num;
                while (set.remove(cur + 1)) {
                    cur++;
                }

                curCount += (cur - num);
                // 搜索完后更新resCount.
                resCount = Math.max(resCount, curCount);
            }
        }
        return resCount;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        Solution128 solution128 = new Solution128();
        System.out.println(solution128.longestConsecutive(nums));
    }
}
