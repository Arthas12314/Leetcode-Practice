public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        return findKthLargest(nums,k,0,nums.length-1);
    }
    private int findKthLargest(int[] nums,int k,int l,int r){
        int v=partition(nums,l,r);
        if(v+1==k)
            return nums[v];
        else if(v+1>k)
            return findKthLargest(nums,k,l,v-1);
        else
            return findKthLargest(nums,k,v+1,r);
    }
    private int partition(int[] nums,int l,int r){
        int e=nums[l],j=l;
        for(int i=l+1;i<=r;i++){
            if(nums[i]>=e)
                swap(nums,++j,i);
        }
        swap(nums,l,j);
        return j;
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int[] a={3,2,1,5,6,4};
        Solution215 t=new Solution215();
        System.out.println(t.findKthLargest(a,2));
    }
}
