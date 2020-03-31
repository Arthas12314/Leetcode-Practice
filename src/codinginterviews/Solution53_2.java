package codinginterviews;

/**
 * @author Arthas
 */
public class Solution53_2 {
    public int missingNumber(int[] nums) {
        int i=0,j=nums.length;
        while (i < j) {
            int mid=i+((j-i)>>>1);
            if (nums[mid] != mid) {
                j = mid;
            } else {
                i=mid+1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Solution53_2 t=new Solution53_2();
        int[] a={1};
        System.out.println(t.missingNumber(a));
    }
}
