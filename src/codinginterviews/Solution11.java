package codinginterviews;

public class Solution11 {
    public int minArray(int[] numbers) {
        int l=0,r=numbers.length-1,mid;
        while (l<=r){
            mid=l+((r-l)>>1);
            if(numbers[mid]<numbers[r]){
                r=mid-1;
            }
            else if(numbers[mid]>numbers[r]){
                l=mid+1;
            }
            else {
                r--;
            }
        }
        return numbers[l];
    }

    public static void main(String[] args) {
        int[] a={};
        Solution11 t=new Solution11();
        System.out.println(t.minArray(a));
    }
}
