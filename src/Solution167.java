public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        /*int[] res=new int[2];
        for(int i=0;i<numbers.length;i++){
            int l=i+1,r=numbers.length-1;
            int temp=target-numbers[i];
            while (l<=r){
                int mid=l+(r-l)/2;
                if(numbers[mid]>temp)
                    r=mid-1;
                else if(numbers[mid]<temp)
                    l=mid+1;
                else{
                    res[0]=i+1;
                    res[1]=mid+1;
                    return res;
                }
            }
        }
        return res;*/
        int i=0,j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                int[] res={i+1,j+1};
                return res;
            }
            else if(numbers[i]+numbers[j]<target){
                i++;
            }
            else {
                j--;
            }
        }
        //return new int[2];
        throw new IllegalArgumentException("No solution!");
    }

    public static void main(String[] args) {
        int[] numbers={2,3,4};
        Solution167 t=new Solution167();
        numbers=t.twoSum(numbers,6);
        for(int n:numbers)
            System.out.println(n);
    }
}
