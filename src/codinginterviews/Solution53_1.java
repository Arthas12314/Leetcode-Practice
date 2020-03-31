package codinginterviews;

/**
 * @author Arthas
 */
public class Solution53_1 {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length,count=0,mid=0;
        if (j < 1) {
            return 0;
        }
        while (i < j) {
            mid=i+((j-i)>>>1);
            if (nums[mid] > target) {
                j = mid;
            } else if (nums[mid] < target) {
                i = mid+1;
            } else {
                break;
            }
        }
        if (nums[mid] != target) {
            return count;
        }
        i=mid;
        j=i+1;
        while (i >= 0 && nums[i] == target) {
            count++;
            i--;
        }
        while (j < nums.length && nums[j] == target) {
            count++;
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution53_1 t=new Solution53_1();
        int[] a={5,7,7,8,8,10,10,11,11,11,11,11};
        System.out.println(t.search(a,6));
    }
}
