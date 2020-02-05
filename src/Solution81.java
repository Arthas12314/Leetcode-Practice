public class Solution81 {
    public boolean search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<r){
            while(l<r && nums[l]==nums[l+1])    l++;
            while(l<r && nums[r]==nums[r-1])    r--;
            int mid=l+(r-l)/2;
            //精彩的异或简化
            /*if((nums[0] > target) ^ (nums[0] > nums[mid]) ^ (target > nums[mid])){
                l=mid+1;
            }*/
            if((nums[mid]>=nums[0] && nums[mid]>=target && target>=nums[0])
                    || (nums[mid]<nums[0] && nums[mid]<=target && target>=nums[0])
                    || (nums[mid]<nums[0] && nums[mid]>=target && target<=nums[0]))
                r=mid;
            else if(nums[mid]==target)
                return true;
            else
                l=mid+1;
        }
        return l==r && nums[l]==target;
    }

    public static void main(String[] args) {
        int[] nums={1,3};
        Solution81 t=new Solution81();
        System.out.println(t.search(nums,3));
    }
}
