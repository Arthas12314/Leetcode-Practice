import java.util.Arrays;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        if(total%2==0) {
            int value1 = findKth(nums1 ,0 ,nums2 ,0 ,total/2+1);
            int value2 = findKth(nums1 ,0 ,nums2 ,0 ,total/2 );
            return (value1+value2)/2.0;
        }
        else
            return findKth(nums1 ,0 ,nums2 ,0 ,total/2+1);
    }
    public static int findKth(int nums1[] , int i ,int []nums2 , int j ,int k) {
        if(nums1.length- i > nums2.length - j )return findKth(nums2, j, nums1, i, k);
        if(nums1.length == i)return nums2[j + k - 1];
        if(k==1)return Math.min(nums1[i],nums2[j]);
        int si = Math.min(i + k / 2,nums1.length);
        int sj = j + k /2 ;
        if(nums1[si-1]>nums2[sj-1]) {
            return findKth(nums1, i, nums2, j + k / 2, k - k / 2);
        }
        else return findKth(nums1, si, nums2, j, k - (si - i));
    }
}
