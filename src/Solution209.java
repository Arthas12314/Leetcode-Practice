public class Solution209 {
    public int minSubArrayLen(int s, int[] nums) {
        int i=0,j=-1,res=Integer.MAX_VALUE,temp=0;
        while(i<nums.length){
            if(j+1<nums.length && temp<s){
                temp+=nums[++j];
            }
            else{
                temp-=nums[i++];
            }
            if(temp>=s)
                res=Math.min(j-i+1,res);
        }
        if(res==Integer.MAX_VALUE)
            return 0;
        return res;
    }
}
