public class Solution11 {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,max=0;
        while(i<j){
            if(Math.min(height[i],height[j])*(j-i)>max)
                max=Math.min(height[i],height[j])*(j-i);
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a={1,8,6,2,5,4,8,3,7};
        Solution11 t=new Solution11();
        System.out.println(t.maxArea(a));
    }
}
