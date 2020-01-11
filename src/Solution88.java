public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*int j=0,i=0,k=0;
        int[] res=new int[nums1.length];
        while(j<n){
            if(i<m && nums1[i]<=nums2[j])
                res[k++]=nums1[i++];
            else
                res[k++]=nums2[j++];
        }
        while(i<m){
            res[k++]=nums1[i++];
        }
        for(i=0;i<nums1.length;i++){
            nums1[i]=res[i];
        }*/
        int r=m-- +n-- -1;
        while(m>=0 && n>=0){
            if(nums1[m]>nums2[n])
                nums1[r--]=nums1[m--];
            else
                nums1[r--]=nums2[n--];
        }
        while(n>=0){
            nums1[r--]=nums2[n--];
        }
    }
}
