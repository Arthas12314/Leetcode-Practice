public class Solution75 {
    public void sortColors(int[] nums) {
        /*int[] count=new int[3];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]+=1;
        }
        int i=0;
        while(i<count[0]){
            nums[i++]=0;
        }
        while(i<count[1]){
            nums[i++]=1;
        }
        while(i<count[2]){
            nums[i++]=2;
        }*/
        int l=0,i=0,r=nums.length-1;
        while(i<=r){
            if(nums[i]==0){
                swap(nums,i++,l++);
            }
            else if(nums[i]==2){
                swap(nums,i,r--);
            }
            else
                i++;
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
