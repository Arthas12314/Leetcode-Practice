package codinginterviews;

import java.util.Arrays;

/**
 * @author Arthas
 */
public class Solution66 {
    public int[] constructArr(int[] a) {
        int[] res=new int[a.length];
        for (int i = 0, product = 1; i < a.length; i++) {
            res[i]=product;
            product*=a[i];
        }
        for (int i = a.length - 1, product = 1; i >= 0; i--) {
            res[i]*=product;
            product*=a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        Solution66 t=new Solution66();
        System.out.println(Arrays.toString(t.constructArr(a)));
    }
}
