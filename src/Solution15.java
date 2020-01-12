import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1,k=nums.length-1,temp;
            if(nums[i]>0)   break;
            if(i>0 && nums[i]==nums[i-1])   continue;
            while(j<k){
                temp=nums[i]+nums[j]+nums[k];
                if(temp==0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while (j<k && nums[j]==nums[j+1]) j++;
                    while (k>j && nums[k]==nums[k-1]) k--;
                    j++;k--;
                }
                else if(temp>0)
                    k--;
                else
                    j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution15 t=new Solution15();
        int[] nums={1,2,4};
        System.out.println(t.threeSum(nums));
    }
}
