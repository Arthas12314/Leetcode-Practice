import java.util.Arrays;

public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length<3)   return 0;
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length;i++){
            int temp;
            if(i>0 && nums[i-1]==nums[i])
                continue;
            int j=i+1,k=nums.length-1;
            while (j < k) {
                temp = nums[i] + nums[j] + nums[k];
                if (temp == target) {
                    return target;
                } else if (temp > target) {
                    if (Math.abs(temp - target) < Math.abs(res - target)) {
                        res = temp;
                    }
                    k--;
                } else {
                    if (Math.abs(temp - target) < Math.abs(res - target)) {
                        res = temp;
                    }
                    j++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={-1,2,1,-4};
        Solution16 t=new Solution16();
        System.out.println(t.threeSumClosest(nums,1));
    }
}
