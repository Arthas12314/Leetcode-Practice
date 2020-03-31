package codinginterviews;

public class Solution04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //基本的二分查找
        /*if(matrix.length<1 || matrix[0].length<1)   return false;
        int l=0,r=matrix[0].length-1;
        for(int[] nums:matrix){
            while(l<=r){
                int mid=l+(r-l)/2;
                if(nums[mid]>target)
                    r=mid-1;
                else if(nums[mid]<target)
                    l=mid+1;
                else
                    return true;
            }
            l=0;r=matrix[0].length-1;
        }
        return false;*/
        if (matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }
        int x=matrix[0].length-1,y=0;
        while(x>=0 && y<matrix.length){
            if (matrix[y][x] > target) {
                x--;
            } else if (matrix[y][x] < target) {
                y++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution04 t=new Solution04();
        int[][] matrix={{-5}};
        System.out.println(t.findNumberIn2DArray(matrix,-5));
    }
}
