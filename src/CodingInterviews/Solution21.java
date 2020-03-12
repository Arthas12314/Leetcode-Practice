package CodingInterviews;

import java.util.Arrays;

public class Solution21 {
    public int[] exchange(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]%2==1){
                i++;
            }
            else{
                swap(nums,i,j--);
            }
        }
        return nums;
    }

    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        Solution21 t=new Solution21();
        System.out.println(Arrays.toString(t.exchange(nums)));
    }
}
