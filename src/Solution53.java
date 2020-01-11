public class Solution53 {
    public int maxSubArray(int[] nums) {
        /*int res=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum>0)
                sum+=nums[i];
            else
                sum=nums[i];
            res=Math.max(res,sum);
        }
        return res;*/
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>0) nums[i]+=nums[i-1];
            sum=Math.max(nums[i],sum);
        }
        return sum;
    }
}
