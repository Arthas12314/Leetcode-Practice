package codinginterviews;

public class Solution15 {
    public int hammingWeight(byte n) {
        int count=0;
        while(n!=0){
            n&=n-1;
            count++;
        }
        return count;
    }
}
