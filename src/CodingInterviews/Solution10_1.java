package CodingInterviews;

public class Solution10_1 {
    public int fib(int n){
        if(n==0)    return 0;
        int i=1,j=1,temp;
        for(int k=2;k<n;k++){
            temp=(i+j)%1000000007;
            i=j%1000000007;
            j=temp;
        }
        return j;
    }

    public static void main(String[] args) {
        Solution10_1 t=new Solution10_1();
        System.out.println(t.fib(100));
    }
}
