import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new LinkedList<>();
        if(nums.length<4)   return res;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            //最外层去重
            if(i>0 && nums[i]==nums[i-1])
                continue;
            for (int j=i+1;j<nums.length;j++){
                int temp;
                //次外层去重
                if(j>i+1&& nums[j]==nums[j-1])
                    continue;
                int k=j+1,n=nums.length-1;
                while (k<n){
                    temp=nums[i]+nums[n]+nums[j]+nums[k];
                    if(temp==target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k],nums[n]));
                        while (k<n && nums[k]==nums[k+1])   k++;
                        while (k<n && nums[n-1]==nums[n])   n--;
                        k++;n--;
                    }
                    else if(temp>target)
                        n--;
                    else
                        k++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution18 t=new Solution18();
        int[] nums={0,4,-5,2,-2,4,2,-1,4};
        System.out.println(t.fourSum(nums,12));
    }
}
