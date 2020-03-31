package codinginterviews;

import java.util.Arrays;

public class Solution17 {
    public int[] printNumbers(int n) {
        int[] map = { 10, 100, 1000, 10000, 100000, 1000000, 10000000,
                100000000, 1000000000, Integer.MAX_VALUE };
        int len=map[n-1];
        int[] res=new int[len-1];
        for(int i=0;i<len-1;i++){
            res[i]=i+1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res=new Solution17().printNumbers(1);
        System.out.println(Arrays.toString(res));
    }
}
