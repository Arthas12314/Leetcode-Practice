class Solution283 {
    public void moveZeroes(int[] nums) {
        /*int k=nums.length;
        for(int i=k-1;i>=0;i--){
            if(nums[i]==0){
                for(int j=i;j<k-1;j++){
                    nums[j]=nums[j+1];
                }
                nums[--k]=0;
            }
        }*/
        /*int len=nums.length,j=0;
        for(int i=0;i<len;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        while (j<len){
            nums[j++]=0;
        }*/
        int len=nums.length,j=0;
        for(int i=0;i<len;i++){
            if(nums[i]!=0){
                if(i!=j)
                    swap(nums,i,j++);
                else
                    j++;
            }
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}