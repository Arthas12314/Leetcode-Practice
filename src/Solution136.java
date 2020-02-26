public class Solution136 {
    public int singleNumber(int[] nums) {
        if(nums.length<1)
            return 0;
        for(int i=1;i<nums.length;i++){
            nums[0]^=nums[i];
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] a={};
        Solution136 t=new Solution136();
        System.out.println(t.singleNumber(a));
    }
}
